// Question 3: Write a file (overwrite)
// Goal: Use BufferedWriter to write 3 lines to out/notes.txt
// Hints: create folder if missing using Files.createDirectories()

import java.io.*;
import java.nio.file.*;

public class Q3 {
    public static void main(String[] args) {
        try {
            Files.createDirectories(Paths.get("out"));
            Path p = Paths.get("out/notes.txt");
            try (BufferedWriter bw = Files.newBufferedWriter(p)) {
                bw.write("Line one");
                bw.newLine();
                bw.write("Line two");
                bw.newLine();
                bw.write("Line three");
            }
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
