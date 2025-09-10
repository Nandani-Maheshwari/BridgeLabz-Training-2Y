import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double a = sc
        .nextDouble();
        System.out.print("Enter second number:");
        double b = sc.nextDouble();
        System.out.print("Enter third number:");
        double c = sc.nextDouble();
        if (a > b && a > c) {
            System.out.println("The first number is greatest");
        } else if (b > c) {
            System.out.println("The second number is greatest");
        } else {
            System.out.println("The third number is greatest");
        }

    }
}