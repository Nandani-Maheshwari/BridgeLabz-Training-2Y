import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Multiples of " + num + " below 100 are:");
        int i = 1;
        while (num * i < 100) {
            System.out.print((num * i) + " ");
            i++;
        }
    }
}
