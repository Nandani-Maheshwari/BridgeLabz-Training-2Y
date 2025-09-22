import java.util.*;

interface Transferrable {
    void transferTo(User receiver, double amount);
}

class Transaction {
    private String type;
    private double amount;
    private Date date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }

    public String toString() {
        return type + ": " + amount + " on " + date;
    }
}

abstract class Wallet implements Transferrable {
    private double balance;
    private List<Transaction> history;

    public Wallet(double initial, boolean referral) {
        this.balance = initial + (referral ? 50 : 0);
        this.history = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void loadMoney(double amount) {
        addBalance(amount);
        history.add(new Transaction("Load", amount));
    }

    public List<Transaction> getHistory() {
        return history;
    }

    protected void recordTransaction(String type, double amount) {
        history.add(new Transaction(type, amount));
    }
}

class PersonalWallet extends Wallet {
    public PersonalWallet(double initial, boolean referral) {
        super(initial, referral);
    }

    public void transferTo(User receiver, double amount) {
        if (amount <= 5000 && deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            recordTransaction("Transfer Sent", amount);
            receiver.getWallet().recordTransaction("Transfer Received", amount);
        }
    }
}

class BusinessWallet extends Wallet {
    public BusinessWallet(double initial, boolean referral) {
        super(initial, referral);
    }

    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;
        double total = amount + tax;
        if (amount <= 50000 && deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            recordTransaction("Transfer Sent (Tax)", total);
            receiver.getWallet().recordTransaction("Transfer Received", amount);
        }
    }
}

class User {
    private String name;
    private Wallet wallet;

    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void showHistory() {
        for (Transaction t : wallet.getHistory()) {
            System.out.println(t);
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        User u1 = new User("Alice", new PersonalWallet(1000, true));
        User u2 = new User("Bob", new BusinessWallet(5000, false));

        u1.getWallet().loadMoney(2000);
        u1.getWallet().transferTo(u2, 3000);

        System.out.println("Alice Balance: " + u1.getWallet().getBalance());
        System.out.println("Bob Balance: " + u2.getWallet().getBalance());

        u1.showHistory();
        u2.showHistory();
    }
}

