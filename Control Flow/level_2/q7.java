import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer:");
        int num = sc.nextInt();
        for(int i = 1; i <= num; ++i) {
            if (num % i == 0) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
