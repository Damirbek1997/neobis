import java.io.IOException;

public class test7 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        for (double i = 0; i <= 2; i += 0.2) {
            for (double j = 1; j <= 3; j++) {
                double temp;
                if (count % 5 == 0) {
                    temp = i + j;
                    System.out.println("I=" + (int)Math.ceil(i) + " J=" + (int)temp);
                } else {
                    temp = i + j;
                    System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", temp));
                }
            }
            count++;
        }
    }
}
