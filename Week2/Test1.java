import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    // method to calculate fibonacci of given number
    public static long fibonacci(int number) {
        // checking if given number 0 or 1
        if (number == 0 || number == 1)
            return number;

        long sum = 1;
        long first = 0;
        long second = 1;

        // calculate fibonacci of given number
        for (int i = 2; i <= number; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }

    // method for printing
    public static void print(long number, long result) {
        System.out.println("Fib(" + number + ") = " + result);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        // loop for taking inputs
        for (int i = 0; i < t; i++) {
            int number = scanner.nextInt();
            // checking if it suits for test case
            if (number >= 0 && number <= 60)
                print(number, fibonacci(number));
        }
    }
}
