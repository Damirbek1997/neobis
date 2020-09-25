import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    // method for checking if x is perfect
    public static boolean perfectNumber(int x) {
        int sum = 0;

        // check if x suits for test case
        if (x >= 1 && x <= Math.pow(x, 8)) {
            // calculating if x divisible by i
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    sum += i;
                }
            }

            if (sum == x)
                return true;
        }

        return false;
    }

    // method for printing
    public static void print(boolean perfectNumber, int x) {
        if (perfectNumber)
            System.out.println(x + " eh perfeito");
        else
            System.out.println(x + " nao eh perfeito");
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // checking if n suits for test case
        if (n >= 1 && n <= 100) {
            // taking inputs
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();

                print(perfectNumber(x), x);
            }
        }
    }
}
