import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary:");
        double salary = (double)sc.nextInt();
        System.out.print("Enter years of service:");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            double bonus_salary = salary + bonus;
            System.out.println("The bonus amount of salary is:" + bonus_salary);
        } else {
            System.out.println("The salary is:" + salary);
        }
    }
}
