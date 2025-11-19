// Question 5: Count lines, words, and characters
// Goal: print counts for data/lorem.txt
// Hints: String.split("\\s+"); include all non-space chars for chars.

import java.io.*;
import java.nio.file.*;

public class Q5 {
    public static void main(String[] args) {
        Path p = Paths.get("data/lorem.txt");
        int lines = 0, words = 0, chars = 0;

        try (BufferedReader br = Files.newBufferedReader(p)) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                words += line.trim().split("\\s+").length;
                chars += line.replace(" ", "").length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Lines=" + lines + " Words=" + words + " Chars=" + chars);
    }
}
