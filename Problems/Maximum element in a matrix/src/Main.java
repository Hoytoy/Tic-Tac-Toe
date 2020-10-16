import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] max = findMax(matrix);

        System.out.printf("%d %d", max[0], max[1]);
    }

    public static int[] findMax(int[][] matrix) {
        int[] max = new int[2];
        int currentMax = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > currentMax) {
                    currentMax = matrix[i][j];
                    max[0] = i;
                    max[1] = j;
                }
            }
        }
        return max;
    }
}