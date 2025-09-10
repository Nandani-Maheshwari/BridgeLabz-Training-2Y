import java.util.Scanner;

public class q4 {
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
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, n);
        return words;
    }
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; 
            result[i][1] = String.valueOf(findLength(words[i])); 
        }
        return result;
    }
    public static String[] findShortestLongest(String[][] wordTable) {
        String shortest = wordTable[0][0];
        String longest = wordTable[0][0];
        int shortestLen = Integer.parseInt(wordTable[0][1]);
        int longestLen = Integer.parseInt(wordTable[0][1]);
        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            String word = wordTable[i][0];
            if (len < shortestLen) {
                shortestLen = len;
                shortest = word;
            }
            if (len > longestLen) {
                longestLen = len;
                longest = word;
            }
        }
        return new String[] { shortest, String.valueOf(shortestLen), longest, String.valueOf(longestLen) };
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = manualSplit(input);
        String[][] wordTable = wordsWithLength(words);
        String[] result = findShortestLongest(wordTable);
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        System.out.println("\nShortest Word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest Word : " + result[2] + " (Length: " + result[3] + ")");
        sc.close();
    }
}
