import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}



