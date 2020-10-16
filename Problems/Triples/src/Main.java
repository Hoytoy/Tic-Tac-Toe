import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        int temp = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] - 1) {
                temp++;
            } else {
                temp = 1;
                continue;
            }
            if (temp >= 3) {
                count++;
            }
        }

        System.out.print(count);
    }
}