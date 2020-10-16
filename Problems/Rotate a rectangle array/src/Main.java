import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nxm = new int[n][m];
        for (int i = 0; i < nxm.length; i++) {
            for (int j = 0; j < nxm[i].length; j++) {
                nxm[i][j] = scanner.nextInt();
            }
        }
        int[][] mxn = rotateClockwise(nxm);

        for (int[] row: mxn) {
            for (int val: row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    public static int[][] rotateClockwise(int[][] rectangle) {
        int n = rectangle.length;
        int m = rectangle[0].length;
        int[][] rotatedRectangle = new int[m][n];
        for (int i = 0; i < rotatedRectangle.length; i++) {
            for (int j = 0; j < rotatedRectangle[i].length; j++) {
                rotatedRectangle[i][j] = rectangle[n - 1 - j][i];
            }
        }
        return rotatedRectangle;
    }
}