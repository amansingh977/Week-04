package banktransaction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testValidWithdrawal() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        BankAccount account = new BankAccount(500);
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(600);
        });
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    void testNegativeWithdrawal() {
        BankAccount account = new BankAccount(1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100);
        });
        assertEquals("Invalid amount!", exception.getMessage());
    }

    @Test
    void testNegativeInitialBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-500);
        });
        assertEquals("Initial balance cannot be negative!", exception.getMessage());
    }
}
