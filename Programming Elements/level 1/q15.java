import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price of an item:");
        double unit_price = sc.nextDouble();
        System.out.print("Enter number of quantities to be bought:");
        double quantity = sc.nextDouble();
        double total_price = unit_price * quantity;
        System.out.println("The total price is:" + total_price);
    }
}
