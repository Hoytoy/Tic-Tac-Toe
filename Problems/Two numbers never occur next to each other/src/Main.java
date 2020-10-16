import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean notNextTo = true;

        for (int i = 1; i < arraySize; i++) {
            if (intArray[i] == n && intArray[i - 1] == m) {
                notNextTo = false;
                break;
            } else if (intArray[i] == m && intArray[i - 1] == n) {
                notNextTo = false;
                break;
            }
        }

        System.out.println(notNextTo);
    }
}