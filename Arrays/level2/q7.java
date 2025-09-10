import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter height in meters (positive): ");
                double height = sc.nextDouble();
                if (height > 0) {
                    personData[i][0] = height;
                    break;
                } else {
                    System.out.println("Height must be positive. Please enter again.");
                }
            }
            while (true) {
                System.out.print("Enter weight in kg (positive): ");
                double weight = sc.nextDouble();
                if (weight > 0) {
                    personData[i][1] = weight;
                    break;
                } else {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            }
            double bmi = personData[i][1] / (personData[i][0] * personData[i][0]);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s%n", 
                              personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}

