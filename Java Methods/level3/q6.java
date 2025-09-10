import java.util.Scanner;

class q6 {
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }
    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }
    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Perfect: " + NumberChecker.isPerfect(num));
        System.out.println("Abundant: " + NumberChecker.isAbundant(num));
        System.out.println("Deficient: " + NumberChecker.isDeficient(num));
        System.out.println("Strong: " + NumberChecker.isStrong(num));
    }
}
