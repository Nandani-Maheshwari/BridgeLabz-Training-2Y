import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        if (num > 0) {
            int sum = num * (num + 1) / 2;
            System.out.println("The sum is:" + sum);
        } else {
            System.out.println("The number is not a natural number");
        }

    }
}
