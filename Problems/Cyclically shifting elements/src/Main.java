import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        a = rightRotation(a);

        for (int var: a) {
            System.out.print(var + " ");
        }
    }

    public static int[] rightRotation(int[] array) {
        int[] rotatedArray = new int[array.length];
        rotatedArray[0] = array[array.length - 1];
        System.arraycopy(array, 0, rotatedArray, 1, array.length - 1);
        return rotatedArray;
    }
}