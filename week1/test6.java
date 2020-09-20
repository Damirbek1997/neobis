import java.io.IOException;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] average = new String[n];
        int[] weight = {2, 3, 5};

        for (int i = 0; i < n; i++) {
            float total = 0;
            int sumOfWeight = 0;
            for (int j = 0; j < 3; j++) {
                float number = scanner.nextFloat();
                total = total + number * weight[j];
                sumOfWeight += weight[j];
            }
            float temp = total / sumOfWeight;
            average[i] = String.format("%.1f", temp);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(average[i]);
        }
    }
}
