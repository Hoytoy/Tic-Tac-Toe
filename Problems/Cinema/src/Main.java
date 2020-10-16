import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] ticketsMatrix = new int[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                ticketsMatrix[i][j] = scanner.nextInt();
            }
        }
        int kSeats = scanner.nextInt();

        int freeRow = freeSeats(ticketsMatrix, kSeats);

        System.out.print(freeRow);
    }

    public static int freeSeats(int[][] matrix, int seats) {
        int k;
        for (int i = 0; i < matrix.length; i++) {
            k = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    k++;
                    if (k == seats) {
                        return i + 1;
                    }
                } else {
                    k = 0;
                }
            }
        }
        return 0;
    }
}