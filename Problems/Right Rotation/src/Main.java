import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        int rotationInput = scanner.nextInt();
        int rotationCount = rotationInput % intArray.length;

        for (int i = 0; i < rotationCount; i++) {
            intArray = rightRotation(intArray);
        }

        for (int var: intArray) {
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