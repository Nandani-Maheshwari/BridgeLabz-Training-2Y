import java.util.Random;
import java.util.Scanner;

class q14 {
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int sumLength = b.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < sumLength; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter rows and columns for second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] matrix1 = MatrixUtil.generateMatrix(r1, c1);
        int[][] matrix2 = MatrixUtil.generateMatrix(r2, c2);
        System.out.println("Matrix 1:");
        MatrixUtil.displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        MatrixUtil.displayMatrix(matrix2);
        if (r1 == r2 && c1 == c2) {
            System.out.println("Addition:");
            MatrixUtil.displayMatrix(MatrixUtil.addMatrices(matrix1, matrix2));
            System.out.println("Subtraction:");
            MatrixUtil.displayMatrix(MatrixUtil.subtractMatrices(matrix1, matrix2));
        } else {
            System.out.println("Addition and Subtraction not possible due to dimension mismatch.");
        }
        if (c1 == r2) {
            System.out.println("Multiplication:");
            MatrixUtil.displayMatrix(MatrixUtil.multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("Multiplication not possible due to dimension mismatch.");
        }
    }
}

