import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();
        Item item = new Item(code, name, price);
        item.displayDetails();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.println("Total Cost: " + item.calculateTotalCost(qty));
        sc.close();
    }
}
