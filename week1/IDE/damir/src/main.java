import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 3000) {
            for (int i = 0; i < t; i++) {
                int pa = scanner.nextInt();
                int pb = scanner.nextInt();
                double g1 = scanner.nextDouble();
                double g2 = scanner.nextDouble();

                if (pa >= 100 && pa < 1000000 && pb >= 100 && pb <= 1000000 && pa < pb) {
                    if (g1 >= 0.1 && g1 <= 10.0 && g2 >= 0.0 && g2 <= 10.0 && g2 < g1) {
                        int years = 0;

                        while (true) {
                            if (pa > pb || years > 200)
                                break;

                            double growPerYearInA = pa + (pa * g1 / 100);
                            double growPerYearInB = pb + (pb * g2 / 100);
                            pa = (int) growPerYearInA;
                            pb = (int) growPerYearInB;
                            years++;
                        }

                        if (years <= 100)
                            System.out.println(years + " anos.");
                        else
                            System.out.println("Mais de 1 seculo.");
                    }
                }
            }
        }
    }
}
