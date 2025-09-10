import java.util.Scanner;

public class q1 {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{String.valueOf(bmi), status};
    }
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4]; 
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiResult = calculateBMI(weight, height);
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }
        return result;
    }
    public static void displayTable(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        System.out.println("Enter Weight(kg) and Height(cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = processBMI(data);
        System.out.println("\nBMI Report:");
        displayTable(result);
        sc.close();
    }
}

