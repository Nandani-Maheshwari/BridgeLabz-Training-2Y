import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int num = sc.nextInt();
        for(int i = num - 1; i != 0; --i) {
            if (num % i == 0) {
                System.out.println("The greatest factor is:" + i);
                break;
            }
        }
    }
}
