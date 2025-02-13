package filehandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class FileHandlerTest {
    @Test
    public void testCopyFile() throws IOException {
        String testSource = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\src.txt";
        String testDest = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\dest.txt";

        // Create a test source file
        try (FileWriter writer = new FileWriter(testSource)) {
            writer.write("Hello, File Handling!");
        }

        FileHandler fileHandler = new FileHandler();
        fileHandler.copyFile(testSource, testDest);

        // Verify the file was copied
        File destFile = new File(testDest);
        assertTrue(destFile.exists());

        // Read contents to verify correctness
        try (BufferedReader reader = new BufferedReader(new FileReader(testDest))) {
            assertEquals("Hello, File Handling!", reader.readLine());
        }

        // Clean up test files
        new File(testSource).delete();
        destFile.delete();
    }
}
