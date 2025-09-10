import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in maths:");
        double maths = sc.nextDouble();
        System.out.print("Enter marks in physics:");
        double physics = sc.nextDouble();
        System.out.print("Enter marks in chemistry:");
        double chemistry = sc.nextDouble();
        double average_percent = (maths + physics + chemistry) / (double)3.0F / (double)100.0F * (double)100.0F;
        System.out.println("Average percent marks in PCM:" + average_percent);
    }
}

