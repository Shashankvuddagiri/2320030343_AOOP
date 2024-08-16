package banking;

public class Deposit extends Transaction {
    private Account account;

    public Deposit(Account account, double amount) {
        super(amount);
        this.account = account;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void reverse() {
        account.reverseDeposit(amount);
    }
}
