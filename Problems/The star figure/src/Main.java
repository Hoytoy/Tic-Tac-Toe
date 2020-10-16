import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        char[][] matrix = new char[n][n];

        for (char[] row: matrix) {
            Arrays.fill(row, '.');
        }

        int middle = n / 2;

        for (int i = 0; i < n; i++) {
            matrix[i][middle] = '*';    // middle column
            matrix[middle][i] = '*';    // middle row
            matrix[i][i] = '*';         // first diagonal
            matrix[i][n - 1 - i] = '*'; // second diagonal
        }

        for (char[] row: matrix) {
            for (char ch: row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}