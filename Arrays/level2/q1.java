import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--;
                continue;
            }
            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--; 
                continue;
            }
            salary[i] = sal;
            yearsOfService[i] = years;
        }
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nEmployee-wise details:");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                              i + 1, salary[i], bonus[i], newSalary[i]);
        }
        System.out.printf("%nTotal Bonus Payout = %.2f%n", totalBonus);
        System.out.printf("Total Old Salary = %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary = %.2f%n", totalNewSalary);
    }
}

