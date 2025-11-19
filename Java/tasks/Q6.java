
// Question 6: Find & highlight keywords
// Goal: print lines containing 'java' (case-insensitive) from data/article.txt

import java.io.*;
import java.nio.file.*;

public class Q6 {
    public static void main(String[] args) {
        Path p = Paths.get("data/article.txt");
        try (BufferedReader br = Files.newBufferedReader(p)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("java"))
                    System.out.println("FOUND: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
