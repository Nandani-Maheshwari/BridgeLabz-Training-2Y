import java.util.Scanner;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Mobile Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Mobile Price: ");
        double price = sc.nextDouble();
        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayDetails();
        sc.close();
    }
}
