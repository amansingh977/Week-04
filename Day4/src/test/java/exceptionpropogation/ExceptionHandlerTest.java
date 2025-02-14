package exceptionpropogation;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlerTest {

    @Test
    void testExceptionPropagation() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionHandler.method2();
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}
