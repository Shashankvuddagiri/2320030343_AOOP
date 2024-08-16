package banking;

public class Withdraw extends Transaction {
    private Account account;

    public Withdraw(Account account, double amount) {
        super(amount);
        this.account = account;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void reverse() {
        account.reverseWithdraw(amount);
    }
}
