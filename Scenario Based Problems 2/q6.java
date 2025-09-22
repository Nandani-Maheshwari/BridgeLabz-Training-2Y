interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

abstract class Account implements ITransaction {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends Account {
    private double interestRate = 4.0;

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends Account {
    private double interestRate = 2.0;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

public class q6 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA1001", 1000);
        sa.deposit(500);
        System.out.println("Savings Balance: " + sa.checkBalance());
        System.out.println("Savings Interest: " + sa.calculateInterest());

        CurrentAccount ca = new CurrentAccount("CA2001", 2000);
        ca.withdraw(500);
        System.out.println("Current Balance: " + ca.checkBalance());
        System.out.println("Current Interest: " + ca.calculateInterest());
    }
}

