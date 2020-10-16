import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] spiral = new int[n][n];
        int n2 = n * n;
        int current = 1;
        int countRight = 0;
        int countDown = 0;
        int countLeft = 0;
        int countUp = 0;

        while (current <= n2) {
            for (int i = countRight; i < n - countRight; i++) {
                spiral[countRight][i] = current;
                current++;
            }
            countRight++;

            for (int i = 1 + countDown; i < n - countDown; i++) {
                spiral[i][n - 1 - countDown] = current;
                current++;
            }
            countDown++;

            for (int i = n - 2 - countLeft; i > countLeft - 1; i--) {
                spiral[n - 1 - countLeft][i] = current;
                current++;
            }
            countLeft++;

            for (int i = n - 2 - countUp; i > countUp; i--) {
                spiral[i][countUp] = current;
                current++;
            }
            countUp++;
        }

        for (int[] rows: spiral) {
            for (int val: rows) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}