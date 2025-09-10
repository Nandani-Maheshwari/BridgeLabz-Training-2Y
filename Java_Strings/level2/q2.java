import java.util.Scanner;

public class q2 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[] manualSplit(String text) {
        int n = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[wordIndex++] = text.substring(start, end);
            start = end + 1; 
        }
        words[wordIndex] = text.substring(start, n);
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] manualWords = manualSplit(input);
        String[] builtInWords = input.split(" ");
        boolean areEqual = compareArrays(manualWords, builtInWords);
        System.out.println("\nManual Split:");
        for (String word : manualWords) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in Split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        System.out.println("\nComparison Result: " + (areEqual ? "Both are equal" : "They differ"));
        sc.close();
    }
}

