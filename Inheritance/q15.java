class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class q15 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        sa.withdraw(1200);
        sa.withdraw(500);
    }
}

