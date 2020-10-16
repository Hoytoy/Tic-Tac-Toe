import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        // First line ans count columns:
        String line = scanner.nextLine();
        String[] countColumns = line.split(" ");
        int columns = countColumns.length;

        // Create a string with all lines separated by " ":
        String matrixString = "";
        while (!line.contains("end")) {
            matrixString = matrixString.concat(line + " ");
            line = scanner.nextLine();
        }

        // Create the original matrix by parsing the string[] to int:
        String[] intString = matrixString.split(" ");
        int rows = intString.length / columns;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Integer.parseInt(intString[i * columns + j]);
            }
        }

        // Calculate the new matrix:
        int[][] neighbours = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int up = matrix[(i - 1 + rows) % rows][j];
                int down = matrix[(i + 1) % rows][j];
                int left = matrix[i][(j - 1 + columns) % columns];
                int right = matrix[i][(j + 1) % columns];
                neighbours[i][j] = up + down + left + right;
            }
        }

        // Print the result:
        for (int[] row: neighbours) {
            for (int val: row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}