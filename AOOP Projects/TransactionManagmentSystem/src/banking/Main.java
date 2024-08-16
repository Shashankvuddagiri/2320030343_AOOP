package banking;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("123456", 1000);
        Account account2 = new Account("654321", 500);

        Transaction deposit = new Deposit(account1, 200);
        deposit.execute();
        deposit.reverse();

        Transaction withdraw = new Withdraw(account1, 150);
        withdraw.execute();
        withdraw.reverse();

        Transaction transfer = new Transfer(account1, account2, 300);
        transfer.execute();
        transfer.reverse();

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
