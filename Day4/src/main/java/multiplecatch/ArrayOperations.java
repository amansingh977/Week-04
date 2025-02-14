package multiplecatch;

public class ArrayOperations {
    public static int getValueAtIndex(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("Array is not initialized!");
        }
        return arr[index]; // Might throw ArrayIndexOutOfBoundsException
    }
}
