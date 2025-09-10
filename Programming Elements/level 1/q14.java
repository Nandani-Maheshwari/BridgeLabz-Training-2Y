import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in miles:");
        double miles = sc.nextDouble();
        double yards = miles * (double)1760.0F;
        System.out.println("Yards is:" + yards);
        double inches = yards / miles;
        System.out.println("Inches is:" + inches);
    }
}
