import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        final int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            int lastDigit = tempNumber % 10;
            digits[index] = lastDigit;
            index++;
            tempNumber /= 10;
            if (index == maxDigit) {
                break; 
            }
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}
