import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.print("Enter third number:");
        int c = sc.nextInt();
        int n1 = a + b * c;
        System.out.println("The first solution is:" + n1);
        int n2 = a * b + c;
        System.out.println("The first solution is:" + n2);
        int n3 = c + a / b;
        System.out.println("The first solution is:" + n3);
        int n4 = a % b + c;
        System.out.println("The first solution is:" + n4);
    }
}