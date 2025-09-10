import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number; 
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;  
            sum += digit;           
            temp = temp / 10;       
        }
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }
        sc.close();
    }
}
