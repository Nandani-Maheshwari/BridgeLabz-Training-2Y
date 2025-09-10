import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + " are:");
        int i = 1; 
        while (i <= num) {
            if (num % i == 0) { 
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}

