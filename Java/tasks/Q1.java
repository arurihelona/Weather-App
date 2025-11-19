
// Question 1: Warm-up: verify a path exists
// Goal: Learn Path, Files.exists.
// Create data/hello.txt manually with any text.
// Print absolute path, and whether it exists & is readable.

import java.nio.file.*;

public class Q1 {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("data/hello.txt");
            System.out.println("Exists: " + Files.exists(p));
            System.out.println("Readable: " + Files.isReadable(p));
            System.out.println("Absolute: " + p.toAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
