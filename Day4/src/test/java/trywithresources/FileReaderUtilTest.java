package trywithresources;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileReaderUtilTest {

    @Test
    void testFileReading() throws IOException {
        File testFile = new File("testfile.txt");
        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("Hello, World!\nThis is a test file.");
        }

        String result = FileReaderUtil.readFirstLine("testfile.txt");
        assertEquals("Hello, World!", result);

        testFile.delete(); // Clean up
    }

    @Test
    void testFileNotFound() {
        String result = FileReaderUtil.readFirstLine("nonexistent.txt");
        assertEquals("Error reading file", result);
    }
}
