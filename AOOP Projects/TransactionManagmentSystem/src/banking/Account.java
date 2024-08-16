package banking;

public class Account {
	private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
            return false;
        }
    }

    public void reverseDeposit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Reversed deposit: " + amount);
        } else {
            System.out.println("Insufficient funds to reverse deposit");
        }
    }

    public void reverseWithdraw(double amount) {
        balance += amount;
        System.out.println("Reversed withdrawal: " + amount);
    }

}
