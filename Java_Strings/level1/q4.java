
public class q4 {
    public static void generateException() {
        String text = null; 
        System.out.println("Length of text: " + text.length()); 
    }
    public static void handleException() {
        String text = null; 
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException! The variable 'text' is null.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("\nHandling NullPointerException:");
        handleException(); 
    }
}
