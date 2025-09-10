import java.util.Random;
import java.util.Scanner;

class q15 {
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];
        return trans;
    }
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])
             - matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])
             + matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
    }
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        double[][] inv = new double[2][2];
        inv[0][0] = matrix[1][1]/det;
        inv[0][1] = -matrix[0][1]/det;
        inv[1][0] = -matrix[1][0]/det;
        inv[1][1] = matrix[0][0]/det;
        return inv;
    }
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        double[][] inv = new double[3][3];
        inv[0][0] = (matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])/det;
        inv[0][1] = (matrix[0][2]*matrix[2][1]-matrix[0][1]*matrix[2][2])/det;
        inv[0][2] = (matrix[0][1]*matrix[1][2]-matrix[0][2]*matrix[1][1])/det;
        inv[1][0] = (matrix[1][2]*matrix[2][0]-matrix[1][0]*matrix[2][2])/det;
        inv[1][1] = (matrix[0][0]*matrix[2][2]-matrix[0][2]*matrix[2][0])/det;
        inv[1][2] = (matrix[0][2]*matrix[1][0]-matrix[0][0]*matrix[1][2])/det;
        inv[2][0] = (matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0])/det;
        inv[2][1] = (matrix[0][1]*matrix[2][0]-matrix[0][0]*matrix[2][1])/det;
        inv[2][2] = (matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0])/det;
        return inv;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns (2 or 3): ");
        int n = sc.nextInt();
        double[][] matrix = MatrixUtil.generateMatrix(n, n);
        System.out.println("Original Matrix:");
        MatrixUtil.displayMatrix(matrix);
        System.out.println("Transpose:");
        MatrixUtil.displayMatrix(MatrixUtil.transpose(matrix));
        if (n == 2) {
            System.out.println("Determinant: " + MatrixUtil.determinant2x2(matrix));
            System.out.println("Inverse:");
            MatrixUtil.displayMatrix(MatrixUtil.inverse2x2(matrix));
        } else if (n == 3) {
            System.out.println("Determinant: " + MatrixUtil.determinant3x3(matrix));
            System.out.println("Inverse:");
            MatrixUtil.displayMatrix(MatrixUtil.inverse3x3(matrix));
        } else {
            System.out.println("Only 2x2 or 3x3 matrices supported.");
        }
    }
}

