import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student fee:");
        double fee = sc.nextDouble();
        System.out.print("Fee discount:");
        double discount = sc.nextDouble();
        double discounted_amount = discount * fee / (double)100.0F;
        System.out.println("The discount is:" + discounted_amount);
        double discounted_price = fee - discounted_amount;
        System.out.println("The price is:" + discounted_price);
    }
}
