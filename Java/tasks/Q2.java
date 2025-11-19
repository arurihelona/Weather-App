// Question 2: Read a whole file, print to console
// Goal: Use BufferedReader to read line-by-line.
// File: data/poem.txt, print each line with line numbers starting at 1.

import java.io.*;
import java.nio.file.*;

public class Q2{
    public static void main(String[] args) {
        Path p = Paths.get("data/poem.txt");
        try (BufferedReader br = Files.newBufferedReader(p)) {
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNum + ": " + line);
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
