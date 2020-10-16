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
        int sum = 0;

        for (int var: intArray) {
            sum += var;
        }

        System.out.println(sum);
    }
}