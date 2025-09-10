import java.util.Scanner;

public class q7 {
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; 
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeArray(String text) {
        char[] reverse = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }
        char[] original = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        boolean iterative = isPalindromeIterative(text);
        System.out.println("\nLogic 1 (Iterative): " + (iterative ? "Palindrome" : "Not Palindrome"));
        boolean recursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Logic 2 (Recursive): " + (recursive ? "Palindrome" : "Not Palindrome"));
        boolean arrayCheck = isPalindromeArray(text);
        System.out.println("Logic 3 (Char Array): " + (arrayCheck ? "Palindrome" : "Not Palindrome"));
        sc.close();
    }
}

