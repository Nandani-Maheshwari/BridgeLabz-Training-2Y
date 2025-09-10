import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers:");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 1.6;
        System.out.println("The miles is:" + miles);
    }
}