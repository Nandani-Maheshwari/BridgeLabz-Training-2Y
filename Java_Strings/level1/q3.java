import java.util.Arrays;
import java.util.Scanner;

public class q3{
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] userChars = getChars(text);
        System.out.println("Characters using user-defined method: " + Arrays.toString(userChars));
        char[] builtInChars = text.toCharArray();
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(builtInChars));
        boolean areEqual = compareCharArrays(userChars, builtInChars);
        System.out.println("Are both character arrays equal? " + areEqual);
        sc.close();
    }
}

