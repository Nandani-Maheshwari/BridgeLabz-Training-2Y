import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double a = sc.nextDouble();
        System.out.print("Enter second number:");
        double b = sc.nextDouble();
        System.out.print("Enter third number:");
        double c = sc.nextDouble();
        if (a < b && a < c) {
            System.out.println("The first number is lowest");
        } else if (b < c) {
            System.out.println("The second number is lowest");
        } else {
            System.out.println("The third number is lowest");
        }

    }
}
