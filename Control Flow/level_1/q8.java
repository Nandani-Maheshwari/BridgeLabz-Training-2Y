import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number for countdown: ");
        int number = sc.nextInt();
        while (number >= 1) {
            System.out.println(number);
            number--;  
        }
        System.out.println("Launch!");
        sc.close();
    }
}

