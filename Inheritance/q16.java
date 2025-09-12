class Account {
    protected double balance;
    Account(double balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        balance -= amount;
    }
    void applyMonthlyFee(double fee) {
        withdraw(fee);
    }
    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double minBalance;
    SavingsAccount(double balance, double minBalance) {
        super(balance);
        this.minBalance = minBalance;
    }
    @Override
    void withdraw(double amount) {
        if (balance - amount < minBalance) {
            System.out.println("Withdrawal denied");
        } else {
            super.withdraw(amount);
        }
    }
}

public class q16 {
    static void assertEqual(double expected, double actual, String testName) {
        if (Math.abs(expected - actual) < 1e-9) {
            System.out.println(testName + " PASSED");
        } else {
            System.out.println(testName + " FAILED: expected " + expected + " but got " + actual);
        }
    }
    public static void main(String[] args) {
        Account a = new Account(1000);
        a.deposit(200);
        assertEqual(1200, a.getBalance(), "Account deposit test");
        a.withdraw(300);
        assertEqual(900, a.getBalance(), "Account withdraw test");

        SavingsAccount s = new SavingsAccount(1000, 500);
        s.withdraw(600);
        assertEqual(1000, s.getBalance(), "Savings withdraw denied test");
        s.withdraw(400);
        assertEqual(600, s.getBalance(), "Savings withdraw allowed test");

        Account sAsAccount = new SavingsAccount(1000, 500);
        sAsAccount.withdraw(600);
        assertEqual(1000, sAsAccount.getBalance(), "Polymorphic withdraw denied test");

        Account a2 = new Account(1000);
        a2.applyMonthlyFee(100);
        assertEqual(900, a2.getBalance(), "Account apply fee test");

        SavingsAccount s2 = new SavingsAccount(1000, 500);
        s2.applyMonthlyFee(600);
        assertEqual(1000, s2.getBalance(), "Savings apply fee via superclass method test");
    }
}

