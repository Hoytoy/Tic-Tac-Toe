import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Scan input and create the board:
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] sudoku = new int[size * size][size * size];
        for (int i = 0; i < size * size; i++) {
            for (int j = 0; j < size * size; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }

        // Declare and initialize the three criteria, whether solved or not:
        boolean rows = rowsSolved(sudoku);
        boolean columns = columnsSolved(sudoku);
        boolean squares = squaresSolved(sudoku);

        // Output the result:
        if (rows && columns && squares) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    // Creates a copy of the board and returns, whether the rows are solved or not:
    public static boolean rowsSolved(int[][] sudoku) {
        int[][] newSudoku = new int[sudoku.length][sudoku.length];
        for (int i = 0; i < sudoku.length; i++) {
            System.arraycopy(sudoku[i], 0, newSudoku[i], 0, sudoku.length);
        }
        return check(newSudoku);
    }

    // Creates a copy of the board with switched rows and columns and returns solved status:
    public static boolean columnsSolved(int[][] sudoku) {
        int[][] newSudoku = new int[sudoku.length][sudoku.length];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                newSudoku[i][j] = sudoku[j][i];
            }
        }
        return check(newSudoku);
    }

    // Creates a copy of the board with small squares made to rows from left to right and top to bottom and returns
    // whether they are solved or not:
    public static boolean squaresSolved(int[][] sudoku) {
        int[][] newSudoku = new int[sudoku.length][sudoku.length];
        int size = (int) Math.sqrt(sudoku.length);
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                newSudoku[i][j] = sudoku[i / size * size + j / size][i % size * size + j % size];
            }
        }
        return check(newSudoku);
    }

    // Checks row by row if the board is solved by sorting every single row:
    public static boolean check(int[][] sudoku) {
        for (int[] row : sudoku) {
            Arrays.sort(row);
            int current = 1;
            for (int val : row) {
                if (val != current) {
                    return false;
                }
                current++;
            }
        }
        return true;
    }
}