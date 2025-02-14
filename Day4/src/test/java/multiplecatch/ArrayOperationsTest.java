package multiplecatch;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    void testValidIndex() {
        int[] arr = {10, 20, 30, 40};
        assertEquals(30, ArrayOperations.getValueAtIndex(arr, 2));
    }

    @Test
    void testInvalidIndex() {
        int[] arr = {5, 15, 25};
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayOperations.getValueAtIndex(arr, 5);
        });
    }

    @Test
    void testNullArray() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            ArrayOperations.getValueAtIndex(null, 1);
        });
        assertEquals("Array is not initialized!", exception.getMessage());
    }
}
