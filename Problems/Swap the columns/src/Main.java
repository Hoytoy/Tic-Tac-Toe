import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();

        int[][] newMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            newMatrix[i] = Arrays.copyOf(matrix[i], m);
        }

        for (int i = 0; i < n; i++) {
            newMatrix[i][c1] = matrix[i][c2];
            newMatrix[i][c2] = matrix[i][c1];
        }

        for (int[] rows: newMatrix) {
            for (int val: rows) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}