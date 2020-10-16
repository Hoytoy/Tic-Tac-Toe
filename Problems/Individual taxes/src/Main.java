import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int comCount = scanner.nextInt();
        double[] income = new double[comCount];
        for (int i = 0; i < comCount; i++) {
            income[i] = scanner.nextDouble();
        }
        double[] taxRate = new double[comCount];
        for (int i = 0; i < comCount; i++) {
            taxRate[i] = scanner.nextDouble();
        }

        double[] tax = new double[comCount];
        for (int i = 0; i < comCount; i++) {
            tax[i] = income[i] * taxRate[i] / 100;
        }

        double max = -1;
        int com = -1;

        for (int i = 0; i < comCount; i++) {
            if (tax[i] > max) {
                max = tax[i];
                com = i;
            }
        }

        System.out.println(com + 1);

    }
}