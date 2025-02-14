package nestedtrycatch;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        NestedTryCatch.processArray(numbers, index, divisor);

        scanner.close();
    }
}
