import java.io.IOException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        double sum = 0;
        double count = 0;

        if (c >= 0 && c <= 11) {
            char t = scanner.next().charAt(0);

            double[][] matrix = new double[12][12];

            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }

            if (String.valueOf(t).equals("S")) {
                for (int i = 0; i < 12; i++) {
                    sum += matrix[i][c];
                }

                System.out.printf("%.1f\n", sum);
            } else if (String.valueOf(t).equals("M")) {
                for (int i = 0; i < 12; i++) {
                    sum += matrix[i][c];
                    count++;
                }

                System.out.printf("%.1f\n", sum / count);
            }
        }
    }
}
