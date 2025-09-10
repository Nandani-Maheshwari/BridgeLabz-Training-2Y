import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in centimeters:");
        double centimeters = sc.nextDouble();
        double feet = centimeters * 0.03281;
        System.out.println("The height in feet:" + feet);
        double inches = feet * (double)12.0F;
        System.out.println("The height in inches:" + inches);
    }
}
