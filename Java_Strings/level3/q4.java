import java.util.Scanner;

public class q4 {
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }g
    static int[][] findCharFrequency(String text) {
        int len = findLength(text);
        int[] freq = new int[256];  
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;      
                result[index][1] = freq[i]; 
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[][] freqArray = findCharFrequency(input);
        System.out.println("Character frequencies:");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.println((char)freqArray[i][0] + " -> " + freqArray[i][1]);
        }
    }
}

