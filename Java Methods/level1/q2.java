import java.util.Scanner;

public class q2 {
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is: " + handshakes);
        sc.close();
    }
}
