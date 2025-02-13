package wordcounter;

import java.io.File;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Capgemini\\Week04_No_GitHub\\Day3\\src\\main\\java\\textfile.txt";
        File file = new File(filePath);

        WordCounter counter = new WordCounter();
        Map<String, Integer> wordCounts = counter.countWords(file);
        counter.displayTopWords(wordCounts, 5);
    }
}
