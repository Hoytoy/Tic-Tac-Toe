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
        boolean ascending = true;

        for (int i = 1; i < arraySize; i++) {
            if (intArray[i] < intArray[i - 1]) {
                ascending = false;
                break;
            }
        }

        System.out.println(ascending);
    }
}