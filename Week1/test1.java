import java.io.IOException;
import java.util.Scanner;
 
public class Test1 {
    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total = 0;
        int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;

        while(true) {
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
            } else
                break;
        }

        System.out.println(n);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");
    }
}