import java.util.Scanner;

public class q10 {
    public static String manualToLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); 
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        String manualLower = manualToLower(input);
        String builtInLower = input.toLowerCase();
        boolean areEqual = compareStrings(manualLower, builtInLower);
        System.out.println("\nOriginal Text: " + input);
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Comparison Result: " + (areEqual ? "Both are equal" : "They differ"));
        sc.close();
    }
}
