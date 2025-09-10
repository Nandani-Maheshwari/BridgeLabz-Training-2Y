import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Earth:");
        double radius = sc.nextDouble();
        double volume = 4.186562 * radius * radius * radius;
        System.out.println("The volume is:" + volume);
        double miles = volume * 0.621371192;
        System.out.println("The miles is:" + miles);
    }
}

