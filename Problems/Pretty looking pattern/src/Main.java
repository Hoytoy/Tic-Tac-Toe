import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[4][4];
        for (int i = 0; i < 4; i++) {
            char[] line = scanner.nextLine().toCharArray();
            System.arraycopy(line, 0, matrix[i], 0, 4);
        }

        System.out.print(isPretty(matrix) ? "YES" : "NO");
    }

    public static boolean isPretty(char[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char ch = matrix[i][j];
                if (ch == matrix[i][j + 1] && ch == matrix[i + 1][j] && ch == matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}