class Product {
    static double discount = 0.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID  : " + productID);
            System.out.println("Price       : $" + price);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Discount    : " + discount + "%");
            System.out.println("-----------------------------");
        } else {
            System.out.println("This is not a Product object.");
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 101, 1200.0, 2);
        Product p2 = new Product("Headphones", 102, 150.0, 3);

        Product.updateDiscount(10);

        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
