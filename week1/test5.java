import java.io.IOException;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int ih = scanner.nextInt(), im = scanner.nextInt();
        int fh = scanner.nextInt(), fm = scanner.nextInt();
        int hours = 0;
        int minutes = 0;

        if (ih >= 0 && ih < 24 && im >= 0 && fm < 60) {
            if (ih == fh && im == fm) {
                hours = 24;
            } else if (ih == fh && im < fm) {
                minutes = fm - im;
            } else if (ih == fh && im > fm) {
                hours = 23;
                int temp = 60 - im;
                minutes = temp + fm;
            } else if (ih > fh && im == fm) {
                int temp = 24 - ih;
                hours = fh + temp;
            } else if (ih > fh && im < fm) {
                int temp = 24 - ih;
                hours = fh + temp;
                minutes = fm - im;
            } else if (ih > fh && im > fm) {
                int temp = 24 - ih;
                hours = fh + temp - 1;
                minutes = fm - im + 60;
            } else if (ih < fh && im == fm) {
                hours = fh - ih;
            } else if (ih < fh && im < fm) {
                hours = fh - ih;
                minutes = fm - im;
            } else if (ih < fh && im > fm) {
                hours = fh - ih - 1;
                minutes = fm - im + 60;
            }

            System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
        }
    }
}
