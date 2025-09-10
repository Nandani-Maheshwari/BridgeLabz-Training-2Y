import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Perimeter is:");
        double perimeter = sc.nextDouble();
        double side_of_square = perimeter / (double)4.0F;
        System.out.println("The side of the square is:" + side_of_square);
    }
}
