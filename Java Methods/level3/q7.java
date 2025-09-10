import java.util.Scanner;

class q7 {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= Math.pow(factor, 3);
        return product;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = NumberChecker.findFactors(num);
        System.out.print("Factors: ");
        for (int factor : factors) System.out.print(factor + " ");
        System.out.println();
        System.out.println("Greatest Factor: " + NumberChecker.greatestFactor(factors));
        System.out.println("Sum of Factors: " + NumberChecker.sumOfFactors(factors));
        System.out.println("Product of Factors: " + NumberChecker.productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + NumberChecker.productOfCubesOfFactors(factors));
    }
}

