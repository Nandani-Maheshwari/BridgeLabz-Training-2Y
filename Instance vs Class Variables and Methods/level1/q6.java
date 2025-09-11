class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Balance (via getter): " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------");
    }
}

public class q6 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("AC001", "Alice", 5000.0);
        acc1.displayDetails();
        acc1.deposit(2000);
        acc1.withdraw(1000);
        System.out.println("Updated Balance: " + acc1.getBalance());

        SavingsAccount savAcc = new SavingsAccount("AC002", "Bob", 10000.0, 4.5);
        savAcc.displaySavingsDetails();
    }
}

