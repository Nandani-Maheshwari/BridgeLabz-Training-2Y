import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        long fact = 1L;
        if (n < 0) {
            System.out.println("Invalid input");
        } else {
            for(int i = 1; i <= n; ++i) {
                fact *= (long)i;
            }
            System.out.println(fact);
        }
    }
}