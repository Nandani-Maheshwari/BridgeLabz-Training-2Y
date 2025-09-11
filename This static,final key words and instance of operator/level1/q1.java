class BankAccount {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    static void getTotalAccounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }
    void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
            System.out.println("Bank Name: " + bankName);
            System.out.println("-----------------------------");
        } else {
            System.out.println("This is not a BankAccount object.");
        }
    }
}
public class q1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1001, 5000);
        BankAccount acc2 = new BankAccount("Bob", 1002, 7500);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
