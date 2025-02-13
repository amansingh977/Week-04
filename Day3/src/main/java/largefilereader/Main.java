package largefilereader;
import java.io.*;
import java.lang.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\largefile.txt";
        File file = new File(filePath);

        LargeFileProcessor processor = new LargeFileProcessor();
        processor.processFile(file);
    }
}
