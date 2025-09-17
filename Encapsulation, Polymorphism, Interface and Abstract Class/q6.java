import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

interface Discountable {
    double applyDiscount(double totalAmount);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.9;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + nonVegCharge;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.95;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg items (extra charge applied)";
    }
}

public class q6 {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
                double finalPrice = d.applyDiscount(total);
                System.out.println("Final Price after discount: " + finalPrice);
            }

            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        FoodItem vegBurger = new VegItem("Veg Burger", 120, 2);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 350, 1);

        order.add(vegBurger);
        order.add(chickenPizza);

        processOrder(order);
    }
}

