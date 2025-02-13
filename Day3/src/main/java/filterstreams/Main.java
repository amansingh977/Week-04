package filterstreams;

import java.io.*;
import java.lang.*;

public class Main {
    private static final java.lang.String SOURCE_FILE = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\src.txt";
    private static final java.lang.String DEST_FILE = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\dest.txt";

    public static void main(String[] args) {
        try {
            TextConverter.convertUppercaseToLowercase(SOURCE_FILE, DEST_FILE);
            System.out.println("File conversion completed successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
