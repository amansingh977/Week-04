package throwthrows;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterestCalculatorTest {

    @Test
    void testValidInterestCalculation() {
        double result = InterestCalculator.calculateInterest(1000, 5, 2);
        assertEquals(100.0, result);
    }

    @Test
    void testNegativeAmountThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(-1000, 5, 2);
        });
        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testNegativeRateThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(1000, -5, 2);
        });
        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }
}
