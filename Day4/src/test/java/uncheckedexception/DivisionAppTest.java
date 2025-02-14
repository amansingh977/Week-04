package uncheckedexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionAppTest {

    @Test
    void testValidDivision() {
        assertEquals(2.5, DivisionApp.divideNumbers(5, 2), 0.0001);
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            DivisionApp.divideNumbers(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
