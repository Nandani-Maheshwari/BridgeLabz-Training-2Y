import java.util.Random;

class q11 {
    public static double[][] generateEmployees(int n) {
        double[][] data = new double[n][2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = 1 + rand.nextInt(15);
        }
        return data;
    }
    public static double calculateBonus(double salary, double years) {
        if (years > 5) return salary * 0.05;
        return salary * 0.02;
    }
}
public class Main {
    public static void main(String[] args) {
        int n = 10;
        double[][] employees = ZaraBonus.generateEmployees(n);
        double totalBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < n; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];
            double bonus = ZaraBonus.calculateBonus(salary, years);
            double newSalary = salary + bonus;
            totalBonus += bonus;
            System.out.printf("%d\t%.2f\t\t%.0f\t%.2f\t%.2f\n", i+1, salary, years, bonus, newSalary);
        }
        System.out.println("Total Bonus to be paid: " + totalBonus);
    }
}

