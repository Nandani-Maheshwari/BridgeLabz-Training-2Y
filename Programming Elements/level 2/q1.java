import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number:");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum is:" + sum);
        float difference = num1 - num2;
        System.out.println("The difference is:" + difference);
        float multiply = num1 * num2;
        System.out.println("The multiplication is:" + multiply);
        float division = num1 / num2;
        System.out.println("The division is:" + division);
    }
}