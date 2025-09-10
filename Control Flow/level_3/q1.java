import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year (checked with multiple if-else).");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year (checked with multiple if-else).");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year (checked with multiple if-else).");
            } else {
                System.out.println(year + " is NOT a Leap Year (checked with multiple if-else).");
            }
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a Leap Year (checked with single if).");
            } else {
                System.out.println(year + " is NOT a Leap Year (checked with single if).");
            }
        }
    }
}

