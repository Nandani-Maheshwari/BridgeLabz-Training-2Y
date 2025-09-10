import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base:");
        double base = sc.nextDouble();
        System.out.print("Enter height:");
        double height = sc.nextDouble();
        double area_of_triangle = (double)0.5F * base * height;
        System.out.println("The area of triangle is:" + area_of_triangle);
        double feet = area_of_triangle * 1.33;
        System.out.println("The feet is:" + feet);
        double inches = feet * (double)12.0F;
        System.out.println("The inches is:" + inches);
    }
}
