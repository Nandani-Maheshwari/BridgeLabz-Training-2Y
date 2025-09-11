import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(String name, double price, int qty) {
        items.add(new CartItem(name, price, qty));
        System.out.println("Item added: " + name);
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(name));
        System.out.println("Item removed: " + name);
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            System.out.println("Cart Items:");
            for (CartItem item : items) {
                System.out.println(item.itemName + " - " + item.quantity + " x " + item.price + " = " + item.getTotalPrice());
            }
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;
        do {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. View Cart\n4. Display Total Cost\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(name, price, qty);
                    break;
                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    cart.displayTotalCost();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}

