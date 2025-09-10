import java.util.Scanner;

public class q2 {
    public static String substringCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStringsCharAt(String str1, String str2) {
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
        System.out.print("Enter the main string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        System.out.println("Substring using charAt(): " + subCharAt);
        String subBuiltIn = text.substring(start, end);
        System.out.println("Substring using substring(): " + subBuiltIn);
        boolean comparisonResult = compareStringsCharAt(subCharAt, subBuiltIn);
        System.out.println("Are both substrings equal? " + comparisonResult);
        sc.close();
    }
}
