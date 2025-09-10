import java.util.Scanner;

public class q10 {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];   
            double heightCm = data[i][1]; 
            double heightM = heightCm / 100; 
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    public static String[] determineStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 24.9) {
                status[i] = "Normal";
            } else if (bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3];
        for (int i = 0; i < teamData.length; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }
        calculateBMI(teamData);
        String[] status = determineStatus(teamData);
        System.out.println("\n--- BMI Report for Team ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < teamData.length; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    teamData[i][0], teamData[i][1], teamData[i][2], status[i]);
        }
        sc.close();
    }
}

