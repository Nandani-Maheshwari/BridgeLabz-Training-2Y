import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("test.txt"); // any file
            System.out.println("File opened successfully.");

        } catch (Exception e) {
            System.out.println("File not found or cannot open.");

        } finally {
            System.out.println("File process finished");
        }
    }
}
