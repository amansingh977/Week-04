package trywithresources;

public class MainApp {
    public static void main(String[] args) {
        String filePath = "info.txt"; // File to read
        String firstLine = FileReaderUtil.readFirstLine(filePath);

        System.out.println(firstLine);
    }
}
