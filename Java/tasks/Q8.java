
// Question 8: Simple CSV reader
// Goal: Read data/students.csv with id,name,marks
// Print average marks.

import java.io.*;
import java.nio.file.*;

public class Q8 {
    public static void main(String[] args) {
        Path p = Paths.get("data/students.csv");
        double total = 0;
        int count = 0;
        try (BufferedReader br = Files.newBufferedReader(p)) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                total += Double.parseDouble(parts[2]);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Average = " + (count > 0 ? total / count : 0));
    }
}
