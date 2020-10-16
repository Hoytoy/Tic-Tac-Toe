import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > max) {
                max = array[i] * array[i + 1];
            }
        }

        System.out.println(max);

    }
}