import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers:");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 1.6;
        System.out.println("Miles:" + miles);
    }
}

