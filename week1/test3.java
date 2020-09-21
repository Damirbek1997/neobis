import java.io.IOException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        if (b > a) {
            double temp = a;
            a = b;
            b = temp;
        }

        if (c > a) {
            double temp = a;
            a = c;
            c = temp;
        }

        if (a > 0 && b > 0 && c > 0) {
            if (a >= b + c) {
                System.out.println("NAO FORMA TRIANGULO");
            } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
        }

        if (a == b && b == c && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || c == a) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
