import java.util.Scanner;

public class q6{
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray(); 
        int[] freq = new int[chars.length]; 
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue; 
            }
            freq[i] = 1; 
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }
        String[] result = new String[chars.length];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " -> " + freq[i];
            }
        }
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] frequency = findFrequency(text);
        System.out.println("\nCharacter Frequencies:");
        for (String f : frequency) {
            System.out.println(f);
        }
        sc.close();
    }
}

