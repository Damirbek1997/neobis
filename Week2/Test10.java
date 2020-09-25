import java.io.IOException;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1, s2, max, min;

        while (sc.hasNextLine()) {
            s1 = sc.nextLine();
            s2 = sc.nextLine();

            if (s1.length() >= s2.length()) {
                max = s1;
                min = s2;
            } else {
                max = s2;
                min = s1;
            }

            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;

            while (maxS > 0 && f) {
                int diff = minLength - maxS;

                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }

            System.out.println(maxS);
        }
    }
}