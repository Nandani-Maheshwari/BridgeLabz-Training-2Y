import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double a = sc.nextDouble();
        if (a % (double)5.0F == (double)0.0F) {
            System.out.println("Print true");
        } else {
            System.out.println("Print false");
        }

    }
}