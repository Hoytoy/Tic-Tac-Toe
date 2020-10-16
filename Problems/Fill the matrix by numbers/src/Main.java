import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.abs(i - j);
            }
        }

        for (int[] rows: matrix) {
            for (int val: rows) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}