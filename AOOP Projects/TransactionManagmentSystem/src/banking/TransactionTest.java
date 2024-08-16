package banking;

import static org.junit.Assert.*;
import org.junit.Test;

public class TransactionTest {

    @Test
    public void testDeposit() {
        Account account = new Account("123456", 1000);
        Transaction deposit = new Deposit(account, 200);
        deposit.execute();
        assertEquals(1200, account.getBalance(), 0.01);

        deposit.reverse();
        assertEquals(1000, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account("123456", 1000);
        Transaction withdraw = new Withdraw(account, 150);
        withdraw.execute();
        assertEquals(850, account.getBalance(), 0.01);

        withdraw.reverse();
        assertEquals(1000, account.getBalance(), 0.01);
    }

    @Test
    public void testTransfer() {
        Account account1 = new Account("123456", 1000);
        Account account2 = new Account("654321", 500);

        Transaction transfer = new Transfer(account1, account2, 300);
        transfer.execute();
        assertEquals(700, account1.getBalance(), 0.01);
        assertEquals(800, account2.getBalance(), 0.01);

        transfer.reverse();
        assertEquals(1000, account1.getBalance(), 0.01);
        assertEquals(500, account2.getBalance(), 0.01);
    }
}
