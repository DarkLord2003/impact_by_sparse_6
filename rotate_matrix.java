import java.util.Scanner;

public class rotate_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix dimensions from user
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Taking matrix elements from user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotating the matrix clockwise
        int[][] rotatedMatrix = rotateClockwise(matrix, n);

        // Printing the rotated matrix
        System.out.println("Rotated matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[][] rotateClockwise(int[][] matrix, int n) {
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }
}