import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = num / 2; 
        int greatestFactor = 1;
        while (i >= 1) {
            if (num % i == 0) {
                greatestFactor = i;
                break; 
            }
            i--;
        }
        System.out.println("The greatest factor of " + num + " (besides itself) is: " + greatestFactor);
        sc.close();
    }
}

