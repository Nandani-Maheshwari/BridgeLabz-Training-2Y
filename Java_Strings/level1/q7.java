import java.util.Scanner;

public class q7 {
    public static void generateException(String text) {
        System.out.println("Generating exception...");
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    public static void handleException(String text) {
        try {
            System.out.println("Handling exception...");
            int number = Integer.parseInt(text); 
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        handleException(input);
        sc.close();
    }
}

