import java.util.Scanner;

public class q7 {
    public static int[] findTrimPoints(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();
        int[] points = findTrimPoints(input);
        String customTrimmed = customSubstring(input, points[0], points[1]);
        String builtInTrimmed = input.trim();
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);
        System.out.println("\nOriginal String: [" + input + "]");
        System.out.println("Custom Trimmed:  [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed:[" + builtInTrimmed + "]");
        System.out.println("Are both results same? " + isSame);
        sc.close();
    }
}

