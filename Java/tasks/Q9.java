
// Question 9: Filter & write
// Goal: from data/students.csv, write only rows with marks >= 80 to out/topper.csv

import java.io.*;
import java.nio.file.*;

public class Q9 {
    public static void main(String[] args) {
        Path src = Paths.get("data/students.csv");
        Path dst = Paths.get("out/topper.csv");

        try {
            Files.createDirectories(dst.getParent());
            try (BufferedReader br = Files.newBufferedReader(src);
                 BufferedWriter bw = Files.newBufferedWriter(dst)) {

                String header = br.readLine();
                bw.write(header);
                bw.newLine();

                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    int marks = Integer.parseInt(parts[2]);
                    if (marks >= 80) {
                        bw.write(line);
                        bw.newLine();
                    }
                }
            }
            System.out.println("Topper list created!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
