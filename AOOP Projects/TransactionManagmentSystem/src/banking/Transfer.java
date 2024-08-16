package banking;

public class Transfer extends Transaction {
    private Account fromAccount;
    private Account toAccount;

    public Transfer(Account fromAccount, Account toAccount, double amount) {
        super(amount);
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    @Override
    public void execute() {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
        }
    }

    @Override
    public void reverse() {
        if (toAccount.withdraw(amount)) {
            fromAccount.deposit(amount);
        }
    }
}
