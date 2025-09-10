import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double a = sc.nextDouble();
        System.out.print("Enter second number:");
        double b = sc.nextDouble();
        System.out.print("Enter third number:");
        double c = sc.nextDouble();
        double n1 = a + b * c;
        System.out.println("The first solution is:" + n1);
        double n2 = a * b + c;
        System.out.println("The first solution is:" + n2);
        double n3 = c + a / b;
        System.out.println("The first solution is:" + n3);
        double n4 = a % b + c;
        System.out.println("The first solution is:" + n4);
    }
}