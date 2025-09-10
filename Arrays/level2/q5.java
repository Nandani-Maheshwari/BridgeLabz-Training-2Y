import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNumber = Math.abs(number); 
        int count = 0;
        int temp = tempNumber;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.print("Reversed number digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}

