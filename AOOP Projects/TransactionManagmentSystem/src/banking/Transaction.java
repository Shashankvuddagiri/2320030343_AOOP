package banking;

public abstract class Transaction {
    protected double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public abstract void execute();
    public abstract void reverse();
}
