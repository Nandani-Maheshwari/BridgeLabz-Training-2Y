import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of pens:");
        double pens = sc.nextDouble();
        System.out.print("Number of students:");
        double students = sc.nextDouble();
        double remainder = pens % students;
        System.out.println("Remainder is:" + remainder);
    }
}

