import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static int[] calculateLengthOfWord(String input) {
        String[] splited = input.split("\\s+");
        int[] lengthofWord = new int[splited.length];

        for (int i = 0; i < splited.length; i++) {
            lengthofWord[i] = splited[i].length();
        }

        return lengthofWord;
    }

    public static StringBuilder concatWhiteSpace(String input) {
        String[] splited = input.split("\\s+");
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < splited.length; i++) {
            word.append(splited[i]);
        }

        return word;
    }

    public static String swap(String word, int[] lengthOfWord) {
        StringBuilder ans = new StringBuilder();
        boolean flag = true;
        int count = 0;
        int i = 0;
        int j = lengthOfWord[0];
        int a = 0;

        while (true) {
            if (count >= word.length())
                return ans.toString();

            if (flag && i < lengthOfWord[0]) {
                ans.append(word.charAt(i));
                i++;
                count++;
                flag = false;
            } else if (!flag && a < lengthOfWord[1]){
                ans.append(word.charAt(j));
                j++;
                count++;
                a++;
                flag = true;
            } else if (i < lengthOfWord[0] && a >= lengthOfWord[1]) {
                ans.append(word.charAt(i));
                i++;
                count++;
            } else if (i >= lengthOfWord[0] && a < lengthOfWord[1]) {
                ans.append(word.charAt(j));
                j++;
                a++;
                count++;
            }
        }
    }

    public static void print(String answer) {
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] lengthOfWord;
        StringBuilder word;
        String ans;

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            lengthOfWord = calculateLengthOfWord(input);
            word = concatWhiteSpace(input);
            ans = swap(word.toString(), lengthOfWord);
            print(ans);
        }
    }
}