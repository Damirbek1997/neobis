import java.io.IOException;
import java.util.Scanner;

public class Test3 {
    // checking if x is prime
    public static boolean primeNumber(int x) {
        boolean flag = true;

        // check if x suits for test case
        if (x >= 1 && x <= Math.pow(x, 7)) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0)
                    flag = false;
            }
        }

        return flag;
    }

    // method to print
    public static void print(boolean primeNumber, int x) {
        if (primeNumber)
            System.out.println(x + " eh primo");
        else
            System.out.println(x + " nao eh primo");
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // check if n suits for test case
        if (n >= 1 && n <= 100) {
            // taking inputs
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                print(primeNumber(x), x);
            }
        }
    }
}
