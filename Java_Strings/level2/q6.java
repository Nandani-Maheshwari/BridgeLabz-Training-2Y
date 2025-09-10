import java.util.Scanner;

public class q6 {
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); 
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];
        try {
            int index = 0;
            while (true) {
                char ch = str.charAt(index);
                result[index][0] = String.valueOf(ch);
                result[index][1] = checkChar(ch);
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
           }
        return result;
    }
        public static void display2DArray(String[][] arr) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-15s%n", arr[i][0], arr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = analyzeString(input);
        display2DArray(result);
        sc.close();
    }
}

