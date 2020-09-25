import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Test5 {
	// method for codifying sentence
    public static ArrayList<Character> codifySentence (int[] index, int rightShift) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Character> result = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            int toSwap;

			// checking if the index of letter in given sentence less or bigger than a letter in alphabet
            if (index[i] >= rightShift) {
				// if it's bigger then it calculating by rightShift
                toSwap = index[i] - rightShift;

                if (toSwap == 26)
                    toSwap = 25;
            } else {
				// if it's not, then plusing size of alphabet to index of letter in given sentence to do not get negative number
                toSwap = index[i] + alphabet.length() - rightShift;

                if (toSwap == 26)
                    toSwap = 25;
            }

            result.add(alphabet.charAt(toSwap));
        }

        return result;
    }

	// method to search index of each letter in given sentence from alphabet
    public static int[] searchLetters (String sentence) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] index = new int[sentence.length()];

        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                String letterInSentence = String.valueOf(sentence.charAt(i));
                String letterInAlphabet = String.valueOf(alphabet.charAt(j));

				// if it finds, then saving it to int array
                if (letterInSentence.equals(letterInAlphabet))
                    index[i] = j;
            }
        }

        return index;
    }

    public static void print (ArrayList<Character> result) {
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }

        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(input);

        for (int i = 0; i < n; i++) {
            String sentence = sc.nextLine().toUpperCase();
            input = sc.nextLine();
            int rightShift = Integer.parseInt(input);
            int[] index = searchLetters(sentence);

            print(codifySentence(index, rightShift));
        }
    }
}