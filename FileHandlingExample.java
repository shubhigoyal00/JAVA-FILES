import java.io.*;
import java.nio.file.*;

public class FileHandlingExample {

    static String filePath = "example.txt";

    // 1. Write (overwrite) to file
    static void writeToFile(String content) throws IOException {
        FileWriter fw = new FileWriter(filePath); // overwrite mode
        fw.write(content);
        fw.close();
        System.out.println("Written to file.");
    }

    // 2. Append to file
    static void appendToFile(String content) throws IOException {
        FileWriter fw = new FileWriter(filePath, true); // append mode
        fw.write(content);
        fw.close();
        System.out.println("Appended to file.");
    }

    // 3. Read from file
    static void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        System.out.println("Reading file:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    // 4. Update file (replace a specific word or line)
    static void updateFile(String oldText, String newText) throws IOException {
        Path path = Paths.get(filePath);
        String content = new String(Files.readAllBytes(path));
        content = content.replaceAll(oldText, newText);
        Files.write(path, content.getBytes());
        System.out.println("File updated.");
    }

    public static void main(String[] args) throws IOException {
        writeToFile("Hello world!\n");
        appendToFile("This is appended line.\n");
        readFile();
        updateFile("world", "Java");
        readFile(); // After update
    }
}
