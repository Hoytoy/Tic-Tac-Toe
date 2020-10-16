import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        for (int i = 0; i < 3; i++) {
            box1[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        int[] box2 = new int[3];
        for (int i = 0; i < 3; i++) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box2);

        if (isSmaller(box1, box2)) {
            System.out.println("Box 1 < Box 2");
        } else if (isSmaller(box2, box1)) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }

    }

    public static boolean isSmaller(int[] smallBox, int[] bigBox) {
        for (int i = 0; i < 3; i++) {
            if (smallBox[i] >= bigBox[i]) {
                return false;
            }
        }
        return true;
    }
}