import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double total = 0;
        int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0;
        int one = 0, half = 0, quarter = 0, oneTenth = 0, fiveHundredths = 0, oneHundredths = 0;
        n = round(n, 2);

        while(total < n) {
            total = round(total, 2);
            if (total + 100 <= n) {
                hundred++;
                total += 100;
            } else if (total + 50 <= n) {
                fifty++;
                total += 50;
            } else if (total + 20 <= n) {
                twenty++;
                total += 20;
            } else if (total + 10 <= n) {
                ten++;
                total += 10;
            } else if (total + 5 <= n) {
                five++;
                total += 5;
            } else if (total + 2 <= n) {
                two++;
                total += 2;
            } else if (total + 1 <= n) {
                one++;
                total += 1;
            } else if (total + 0.50 <= n) {
                half++;
                total += 0.5;
            } else if (total + 0.25 <= n) {
                quarter++;
                total += 0.25;
            } else if (total + 0.10 <= n) {
                oneTenth++;
                total += 0.1;
            } else if (total + 0.05 <= n) {
                fiveHundredths++;
                total += 0.05;
            } else if (total + 0.01 <= n) {
                oneHundredths++;
                total = total + 0.01;
            }

            System.out.println(total);
        }

        System.out.println("NOTAS:");
        System.out.println(hundred + " nota(s) de R$ 100.00");
        System.out.println(fifty + " nota(s) de R$ 50.00");
        System.out.println(twenty + " nota(s) de R$ 20.00");
        System.out.println(ten + " nota(s) de R$ 10.00");
        System.out.println(five + " nota(s) de R$ 5.00");
        System.out.println(two + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(one + " moeda(s) de R$ 1.00");
        System.out.println(half + " moeda(s) de R$ 0.50");
        System.out.println(quarter + " moeda(s) de R$ 0.25");
        System.out.println(oneTenth + " moeda(s) de R$ 0.10");
        System.out.println(fiveHundredths + " moeda(s) de R$ 0.05");
        System.out.println(oneHundredths + " moeda(s) de R$ 0.01");
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
