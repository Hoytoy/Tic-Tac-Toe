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
        int soughtAfterInt = scanner.nextInt();
        boolean intIncluded = false;

        for (int num: intArray) {
            if (num == soughtAfterInt) {
                intIncluded = true;
                break;
            }
        }

        System.out.println(intIncluded);
    }
}