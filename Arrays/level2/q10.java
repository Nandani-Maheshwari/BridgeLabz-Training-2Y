import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = Math.abs(sc.nextLong()); 
        int temp = (int)number;
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            long tempNumber = number;
            while (tempNumber != 0) {
                count++;
                tempNumber /= 10;
            }
        }
        int[] digits = new int[count];
        long tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(tempNumber % 10);
            tempNumber /= 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit\tFrequency");
        System.out.println("----------------");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }
    }
}

