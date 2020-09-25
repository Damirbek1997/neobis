import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        ArrayList<Character> l = new ArrayList<>(s.length());
        boolean b = true;

        for(int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);

            if(charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
                l.add(charAt);
            }
        }

        for(int i = 0, j = l.size() - 1; i < j; i++, j--) {
            if(l.get(i) != l.get(j)) {
                b = false;
                break;
            }
        }

        System.out.println(b ? "S" : "N");
    }
}