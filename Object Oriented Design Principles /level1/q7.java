import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " by Customer: " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : products) {
            System.out.println(p.getName() + " - $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        System.out.println("Orders of " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Phone", 500);
        Product p3 = new Product("Headphones", 100);
        Order o1 = new Order(1, c1);
        Order o2 = new Order(2, c2);
        o1.addProduct(p1);
        o1.addProduct(p3);
        o2.addProduct(p2);
        o2.addProduct(p3);
        c1.placeOrder(o1);
        c2.placeOrder(o2);
        c1.showOrders();
        c2.showOrders();
    }
}
