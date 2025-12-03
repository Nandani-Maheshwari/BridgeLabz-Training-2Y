import java.util.*;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) {
        super(msg);
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        try {
            if (pass.length() < 6) {
                throw new InvalidPasswordException("Password must be at least 6 characters!");
            }
            System.out.println("Password accepted.");

        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
