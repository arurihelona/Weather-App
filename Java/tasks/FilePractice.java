// File: FilePractice.java
// Demonstrates all file operations in one program

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FilePractice {
    public static void main(String[] args) {
        try {

            // 1) Check path exists
            Path p = Paths.get("data/hello.txt");
            System.out.println("Exists: " + Files.exists(p));
            System.out.println("Readable: " + Files.isReadable(p));
            System.out.println("Absolute: " + p.toAbsolutePath());
            System.out.println("--");

            // 2) Read file line by line
            Path poem = Paths.get("data/poem.txt");
            if (Files.exists(poem)) {
                BufferedReader br = Files.newBufferedReader(poem);
                String line; int n = 1;
                while ((line = br.readLine()) != null)
                    System.out.println(n++ + ": " + line);
                br.close();
            }
            System.out.println("--");

            // 3) Write (overwrite)
            Files.createDirectories(Paths.get("out"));
            BufferedWriter bw = Files.newBufferedWriter(Paths.get("out/notes.txt"));
            bw.write("Line 1\nLine 2\nLine 3\n");
            bw.close();
            System.out.println("notes.txt written");
            System.out.println("--");

            // 4) Append vs overwrite
            Path log = Paths.get("out/log.txt");
            bw = Files.newBufferedWriter(log, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            if (Files.size(log) == 0) bw.write("Start\n");
            else bw.write("Time: " + new Date() + "\n");
            bw.close();
            System.out.println("log.txt updated");
            System.out.println("--");

            // 5) Count lines, words, chars
            Path lorem = Paths.get("data/lorem.txt");
            int lines = 0, words = 0, chars = 0;
            if (Files.exists(lorem)) {
                for (String l : Files.readAllLines(lorem)) {
                    lines++;
                    if (!l.trim().isEmpty()) words += l.trim().split("\\s+").length;
                    chars += l.replaceAll("\\s", "").length();
                }
                System.out.println("Lines=" + lines + " Words=" + words + " Chars=" + chars);
            }
            System.out.println("--");

            // 6) Find keyword "java"
            Path art = Paths.get("data/article.txt");
            if (Files.exists(art)) {
                for (String l : Files.readAllLines(art))
                    if (l.toLowerCase().contains("java"))
                        System.out.println("FOUND: " + l);
            }
            System.out.println("--");

            // 7) Copy file
            Path copy = Paths.get("out/poem_copy.txt");
            if (Files.exists(poem)) {
                Files.copy(poem, copy, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("poem copied");
            }
            System.out.println("--");

            // 8) Simple CSV average
            Path csv = Paths.get("data/students.csv");
            if (Files.exists(csv)) {
                List<String> rows = Files.readAllLines(csv);
                double total = 0; int count = 0;
                for (int i = 1; i < rows.size(); i++) {
                    String[] a = rows.get(i).split(",");
                    total += Double.parseDouble(a[2]);
                    count++;
                }
                System.out.println("Average=" + total / count);
            }
            System.out.println("--");

            // 9) Filter marks >= 80
            Path top = Paths.get("out/topper.csv");
            if (Files.exists(csv)) {
                List<String> r = Files.readAllLines(csv);
                bw = Files.newBufferedWriter(top);
                bw.write(r.get(0) + "\n");
                for (int i = 1; i < r.size(); i++) {
                    String[] a = r.get(i).split(",");
                    if (Integer.parseInt(a[2].trim()) >= 80)
                        bw.write(r.get(i) + "\n");
                }
                bw.close();
                System.out.println("topper.csv created");
            }

        } catch (IOException | NumberFormatException e) {
        }
    }
}
