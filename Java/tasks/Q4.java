// Question 4: Append vs overwrite
// Goal: open file in append mode
// Run twice: first run writes "Start", second appends timestamp

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;

public class Q4 {
    public static void main(String[] args) {
        Path p = Paths.get("out/log.txt");
        try {
            Files.createDirectories(p.getParent());
            try (BufferedWriter bw = Files.newBufferedWriter(
                    p,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND)) {

                if (Files.size(p) == 0)
                    bw.write("Start\n");
                else
                    bw.write("Timestamp: " + LocalDateTime.now() + "\n");
            }
            System.out.println("Write complete!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
