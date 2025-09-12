class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }
}

public class q5 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000);
        account.deposit(500);
        System.out.println("Final Balance: " + account.getBalance());
    }
}

