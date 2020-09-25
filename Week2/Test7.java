import java.io.IOException;
import java.util.Scanner;

public class asd {
	// method to calculate survivors
    public static int calculateSurvivors (int n, int k) {
        int ans = 0;

        for (int i = 2; i <= n; i++)
            ans = (ans + k) % i;

        return ans;
    }

    public static void print(int i, int survivor) {
        System.out.println("Case " + i + ": " + survivor);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int nc = sc.nextInt();

		// check if nc suits for test case
        if (nc >= 1 && nc <= 30) {
            for (int i = 1; i <= nc; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();

				// check if n and k suits for case
                if (n >= 1 && n <= 10000 && k >= 1 && k <= 10000) {
                    int survivor = calculateSurvivors(n, k) + 1;
                    print(i, survivor);
                }
            }
        }
    }
}