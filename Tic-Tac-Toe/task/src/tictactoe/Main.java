package tictactoe;

import java.util.Scanner;

public class Main {
    // Variable to check if the game is finished:
    public static boolean isFinished = false;
    // Variable to check whose turn it is:
    public static char activePlayer = 'X';

    public static void main(String[] args) {

        char[][] field = createField();


        // Call method to print the field:
        printField(field);

        while (!isFinished) {
            // Call method to check the field:
            gameStatus(field);
        }
    }

    // Creates an empty field:
    public static char[][] createField() {
        return new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    // Prints the field with borders and spaces:
    public static void printField(char[][] field) {
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", field[0][0], field[0][1], field[0][2]);
        System.out.printf("| %c %c %c |\n", field[1][0], field[1][1], field[1][2]);
        System.out.printf("| %c %c %c |\n", field[2][0], field[2][1], field[2][2]);
        System.out.println("---------");
    }

    // Checks the status and prints the result:
    public static void gameStatus(char[][] field) {
        if (isImpossible(field) || xWins(field) && oWins(field)) {
            System.out.println("Impossible");
            isFinished = true;
        } else if (xWins(field)) {
            System.out.println("X wins");
            isFinished = true;
        } else if (oWins(field)) {
            System.out.println("O wins");
            isFinished = true;
        } else if (isFull(field)) {
            System.out.println("Draw");
            isFinished = true;
        } else {
            nextMove(field);
        }
    }

    // Checks if field is impossible:
    public static boolean isImpossible(char[][] field) {
        int countX = 0;
        int countO = 0;
        for (char[] row: field) {
            for (char ch: row) {
                switch (ch) {
                    case 'X':
                        countX++;
                        break;
                    case 'O':
                        countO++;
                        break;
                    default:
                        break;
                }
            }
        }

        return Math.abs(countO - countX) > 1;
    }

    // Checks if there are three Xs in a row:
    public static boolean xWins(char[][] field) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == 'X' && field[i][1] == 'X' && field[i][2] == 'X') {
                return true;
            }
            if (field[0][i] == 'X' && field[1][i] == 'X' && field[2][i] == 'X') {
                return true;
            }
        }
        if (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') {
            return true;
        }
        return field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X';
    }

    // Checks if there are three Os in a row:
    public static boolean oWins(char[][] field) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == 'O' && field[i][1] == 'O' && field[i][2] == 'O') {
                return true;
            }
            if (field[0][i] == 'O' && field[1][i] == 'O' && field[2][i] == 'O') {
                return true;
            }
        }
        if (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == 'O') {
            return true;
        }
        return field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == 'O';
    }

    // Checks if the field is full:
    public static boolean isFull(char[][] field) {
        for (char[] row: field) {
            for (char ch: row) {
                if (ch != 'X' && ch != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    // Reads and validates the player's next move/input:
    public static void nextMove(char[][] field) {
        Scanner scanner = new Scanner(System.in);
        boolean rightInput = false;
        int row;
        int column;
        while(!rightInput) {
            System.out.print("Enter the coordinates: ");
            if (scanner.hasNextInt()) {
                column = scanner.nextInt() - 1;
            } else {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (scanner.hasNextInt()) {
                row = 3 - scanner.nextInt();
            } else {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (!isEmpty(field[row][column])) {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                field[row][column] = activePlayer;
                activePlayer = activePlayer == 'X' ? 'O' : 'X';
                rightInput = true;
            }
        }
        printField(field);
    }

    // Checks if the cell is empty:
    public static boolean isEmpty(char cell) {
        return cell != 'X' && cell != 'O';
    }
}
