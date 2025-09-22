import java.time.LocalDate;

interface ISellable {
    void sell(int quantity);
    boolean checkExpiry();
}

abstract class Medicine implements ISellable {
    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 100);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void sell(int qty) {
        if(qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " units of " + name + " sold. Total: " + qty * price);
        } else {
            System.out.println("Insufficient stock for " + name);
        }
    }

    @Override
    public abstract boolean checkExpiry();
}

class Tablet extends Medicine {
    public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isBefore(LocalDate.now().plusYears(2));
    }
}

class Syrup extends Medicine {
    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isBefore(getExpiryDate());
    }

    private LocalDate getExpiryDate() {
        return LocalDate.now().plusMonths(6);
    }
}

class Injection extends Medicine {
    public Injection(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isBefore(getExpiryDate());
    }

    private LocalDate getExpiryDate() {
        return LocalDate.now().plusMonths(12);
    }
}

public class q14 {
    public static void main(String[] args) {
        Tablet t1 = new Tablet("Paracetamol", 5, LocalDate.of(2026, 5, 1), 50);
        Syrup s1 = new Syrup("Cough Syrup", 25, LocalDate.of(2025, 12, 1), 30);
        Injection i1 = new Injection("Vitamin B12", 100, LocalDate.of(2026, 6, 1), 20);

        t1.sell(10);
        s1.sell(5);
        i1.sell(2);

        System.out.println("Tablet expired? " + t1.checkExpiry());
        System.out.println("Syrup expired? " + s1.checkExpiry());
        System.out.println("Injection expired? " + i1.checkExpiry());
    }
}
