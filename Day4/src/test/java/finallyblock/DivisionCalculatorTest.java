package finallyblock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionCalculatorTest {

    @Test
    void testValidDivision() {
        assertEquals(5, DivisionCalculator.divide(10, 2));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            DivisionCalculator.divide(10, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}

