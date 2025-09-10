import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("The sum is " + sum);
                return;
            }
            sum += n;
        }
    }
}

