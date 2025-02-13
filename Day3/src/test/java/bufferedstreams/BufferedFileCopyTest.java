package bufferedstreams;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BufferedFileCopyTest {
    @Test
    public void testBufferedCopyCreatesFile() throws IOException {
        String sourcePath = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\src.txt\\source.txt";
        String destPath = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\test_buffered_dest.txt";

        BufferedFileCopy.copy(sourcePath, destPath);

        File destFile = new File(destPath);
        assertTrue(destFile.exists(), "Buffered copy should create the destination file.");
    }
}
