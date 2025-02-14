package checkedexception;

import java.io.*;

public class FileReaderApp {
    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            return "File not found";
        }
        return content.toString().trim();
    }

    public static void main(String[] args) {
        String filePath = "data.txt";
        String result = readFile(filePath);
        System.out.println(result);
    }
}
