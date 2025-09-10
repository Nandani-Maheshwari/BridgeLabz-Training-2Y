import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        double[][] marks = new double[number][3]; 
        double[] percentage = new double[number];
        String[] grade = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter marks in Physics (0-100): ");
                double physics = sc.nextDouble();
                if (physics >= 0 && physics <= 100) {
                    marks[i][0] = physics;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter again.");
                }
            }
            while (true) {
                System.out.print("Enter marks in Chemistry (0-100): ");
                double chemistry = sc.nextDouble();
                if (chemistry >= 0 && chemistry <= 100) {
                    marks[i][1] = chemistry;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter again.");
                }
            }
            while (true) {
                System.out.print("Enter marks in Maths (0-100): ");
                double maths = sc.nextDouble();
                if (maths >= 0 && maths <= 100) {
                    marks[i][2] = maths;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter again.");
                }
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B+";
            } else if (percentage[i] >= 60) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else {
                grade[i] = "F";
            }
        }
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f\t\t%s%n",
                              marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}
