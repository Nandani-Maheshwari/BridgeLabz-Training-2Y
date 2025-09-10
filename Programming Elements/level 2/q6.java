import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        double num2 = sc.nextDouble();
        double divide = num1 / num2;
        System.out.println("The divide of 'num1' and 'num2' is:" + divide);
        double modulus = num1 % num2;
        System.out.println("The modulus of 'num1' and 'num2' is:" + modulus);
    }
}


