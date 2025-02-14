package finallyblock;

public class DivisionCalculator {
    public static int divide(int a, int b) {
        try {
            return a / b; // May throw ArithmeticException
        } finally {
            System.out.println("Operation completed");
        }
    }
}
