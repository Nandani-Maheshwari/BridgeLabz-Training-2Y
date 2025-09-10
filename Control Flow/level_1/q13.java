import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for(int i = n; i >= 0; ++i) {
            sum = n * (n + 1) / 2;
        }
        System.out.println(sum);
    }
}
