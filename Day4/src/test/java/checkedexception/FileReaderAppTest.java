package checkedexception;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderAppTest {

    @Test
    void testFileExists() throws IOException {
        String testFilePath = "test_data.txt";
        File testFile = new File(testFilePath);

        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("Hello, World!");
        }

        String result = FileReaderApp.readFile(testFilePath);
        assertEquals("Hello, World!", result);

        testFile.delete(); // Clean up after test
    }

    @Test
    void testFileNotFound() {
        String result = FileReaderApp.readFile("non_existent_file.txt");
        assertEquals("File not found", result);
    }
}
