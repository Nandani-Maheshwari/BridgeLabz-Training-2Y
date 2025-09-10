import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; ++i) {
            if (num > 5 && num < 9) {
                int num1 = num * i;
                System.out.println(num1);
            }
        }
    }
}
