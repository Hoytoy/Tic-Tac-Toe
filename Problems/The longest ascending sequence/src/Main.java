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
        int max = 1;
        int temp = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                temp++;
            } else {
                if (temp > max) {
                    max = temp;
                }
                temp = 1;
            }
        }

        if (temp > max) {
            max = temp;
        }

        System.out.println(max);

    }
}