import java.util.Scanner;

public class q3 {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; 
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year " + year + " is before the Gregorian calendar (not applicable).");
        } else if (isLeapYear(year)) {
            System.out.println("Year " + year + " is a Leap Year.");
        } else {
            System.out.println("Year " + year + " is NOT a Leap Year.");
        }
        sc.close();
    }
}

