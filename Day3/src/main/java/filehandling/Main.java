package filehandling;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        String sourceFilePath = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\src.txt";
        String destinationFilePath = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\dest.txt";

        fileHandler.copyFile(sourceFilePath, destinationFilePath);
    }
}
