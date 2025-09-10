import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        double students = sc.nextDouble();
        double maximum_number_of_handshakes = students * (students - (double)1.0F) / (double)2.0F;
        System.out.println("Maximum number of hanshakes:" + maximum_number_of_handshakes);
    }
}

