import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter index (0-2): ");
            int index = sc.nextInt();

            System.out.print("Enter value: ");
            int value = sc.nextInt();

            arr[index] = value;
            System.out.println("Inserted successfully!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range!");

        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only!");

        }
    }
}
