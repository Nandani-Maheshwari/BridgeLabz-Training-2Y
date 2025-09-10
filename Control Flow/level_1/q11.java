import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = sc.nextInt();
            if (num <= 0) {   // if 0 or negative, break the loop
                break;
            }
            sum += num;  // add to sum
        }
        System.out.println("Sum of entered numbers: " + sum);
        sc.close();
    }
}

