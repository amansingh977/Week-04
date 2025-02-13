package userinput;

import java.io.IOException;

public class UserInputHandler {
    private static final String FILE_PATH = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\user_data.txt";

    public static void handleUserInput() throws IOException {
        String[] userData = UserInputReader.readUserInput();
        UserInputWriter.writeToFile(FILE_PATH, userData);
        System.out.println("User data saved successfully to: " + FILE_PATH);
    }
}
