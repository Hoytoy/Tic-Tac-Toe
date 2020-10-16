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
        boolean nextTo = false;

        for (int i = 1; i < arraySize - 1; i++) {
            if (intArray[i] == n && (intArray[i - 1] == m || intArray[i + 1] == m)) {
                nextTo = true;
                break;
            } else if (intArray[i] == m && (intArray[i - 1] == n || intArray[i + 1] == n)) {
                nextTo = true;
                break;
            }
        }

        System.out.println(nextTo);
    }
}