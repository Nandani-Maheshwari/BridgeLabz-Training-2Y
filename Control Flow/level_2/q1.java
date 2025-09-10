import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("\nEven numbers between 1 and " + n + ":");
        for(int i = 1; i <= n; ++i) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nOdd numbers between 1 and " + n + ":");
        for(int i = 1; i <= n; ++i) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}