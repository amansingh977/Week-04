package nestedtrycatch;

public class NestedTryCatch {

    public static void processArray(int[] arr, int index, int divisor) {
        try {
            System.out.println("Trying to access index: " + index);
            int value = arr[index]; // Might throw ArrayIndexOutOfBoundsException

            try {
                System.out.println("Trying to divide " + value + " by " + divisor);
                int result = value / divisor; // Might throw ArithmeticException
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
