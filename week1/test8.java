import java.io.IOException;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 1 && x < 20 && x < y && y < 100000) {
            int count = 1;
            while (count <= y) {
                if (count % x == 0)
                    System.out.println(count);
                else
                    System.out.print(count + " ");
                count++;
            }
        }
    }
}
