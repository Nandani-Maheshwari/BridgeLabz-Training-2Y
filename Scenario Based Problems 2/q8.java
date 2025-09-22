import java.util.*;

interface ICheckout {
    void generateBill();
    void applyDiscount();
}

class Product {
    private String name;
    private double price;
    private String category;
    private int quantity;

    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public double getDiscountedPrice() {
        return getTotalPrice();
    }
}

class PerishableProduct extends Product {
    public PerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    public double getDiscountedPrice() {
        return getTotalPrice() * 0.9;
    }
}

class NonPerishableProduct extends Product {
    public NonPerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    public double getDiscountedPrice() {
        return getTotalPrice() * 0.95;
    }
}

class Cart implements ICheckout {
    private List<Product> products;
    private double totalPrice;

    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public Cart(List<Product> products) {
        this.products = products;
        updateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        updateTotal();
    }

    private void updateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

    @Override
    public void generateBill() {
        System.out.println("Bill:");
        for (Product p : products) {
            System.out.println(p.getName() + " - " + p.getQuantity() + " x " + p.getBasePrice() + " = " + p.getTotalPrice());
        }
        System.out.println("Total: " + totalPrice);
    }

    @Override
    public void applyDiscount() {
        double discountedTotal = 0;
        for (Product p : products) {
            discountedTotal += p.getDiscountedPrice();
        }
        System.out.println("Discounted Total: " + discountedTotal);
    }
}

public class q8 {
    public static void main(String[] args) {
        Product apple = new PerishableProduct("Apple", 50, "Fruit", 2);
        Product rice = new NonPerishableProduct("Rice", 200, "Grain", 1);

        Cart cart = new Cart();
        cart.addProduct(apple);
        cart.addProduct(rice);

        cart.generateBill();
        cart.applyDiscount();
    }
}

