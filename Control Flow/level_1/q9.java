import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i = n; i >= 0; --i) {
            System.out.println(i + " ");
        }
    }
}

