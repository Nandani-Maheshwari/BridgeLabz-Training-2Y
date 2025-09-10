import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Amar:");
        int age1 = sc.nextInt();
        double height1 = sc.nextDouble();
        System.out.print("Enter the age of Akbar:");
        int age2 = sc.nextInt();
        double height2 = sc.nextDouble();
        System.out.print("Enter the age of Anthony:");
        int age3 = sc.nextInt();
        double height3 = sc.nextDouble();
        if (age1 > age2 && age1 > age3) {
            System.out.println("Amar is bigger agewise");
        } else if (age2 > age3) {
            System.out.println("Akbar is bigger agewise");
        } else {
            System.out.println("Anthony is bigger agewise");
        }

        if (height1 > height2 && height1 > height3) {
            System.out.println("Akbar is biggest");
        } else if (height2 > height3) {
            System.out.println("Akbar is bigger");
        } else {
            System.out.println("Anthony is smallest");
        }

    }
}

