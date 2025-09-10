import java.util.Random;
import java.util.Scanner;

class q13 {
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            marks[i][0] = 10 + rand.nextInt(90);
            marks[i][1] = 10 + rand.nextInt(90);
            marks[i][2] = 10 + rand.nextInt(90);
        }
        return marks;
    }
    public static double[][] calculateTotals(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = StudentScores.generateMarks(n);
        double[][] results = StudentScores.calculateTotals(marks);
        StudentScores.displayScorecard(marks, results);
    }
}

