
// Question 7: Copy a text file
// Goal: Copy data/poem.txt → out/poem_copy.txt

import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;

public class Q7 {
    public static void main(String[] args) {
        Path src = Paths.get("data/poem.txt");
        Path dst = Paths.get("out/poem_copy.txt");
        try {
            Files.createDirectories(dst.getParent());
            Files.copy(src, dst, REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
