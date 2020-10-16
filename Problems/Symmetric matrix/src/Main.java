import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        // Read the input and create matrix:
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.next();
            }
        }

        // Check symmetry and output the result:
        System.out.print(isSymmetric(matrix, n) ? "YES" : "NO");
    }

    public static boolean isSymmetric(String[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (!matrix[i][j].equals(matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }
}