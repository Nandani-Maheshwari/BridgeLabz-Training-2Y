import java.util.Scanner;

public class q8 {
    public static void generateException(String[] names) {
        System.out.println("Generating exception...");
        System.out.println("Accessing element at index 5: " + names[5]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Handling exception...");
            System.out.println("Accessing element at index 5: " + names[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); 
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        handleException(names);
        sc.close();
    }
}
