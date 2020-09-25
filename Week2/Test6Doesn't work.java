import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Doesnt work (1 version, 2 in website)
public class Test6 {
    public static boolean[] lengthCheck (ArrayList<String> password) {
        boolean[] check = new boolean[password.size()];

        for (int i = 0; i < password.size(); i++) {
            String stringFromArray = password.get(i);

            if (stringFromArray.length() >= 6 && stringFromArray.length() <= 36)
                check[i] = true;
            else
                check[i] = false;
        }

        return check;
    }

    public static boolean[] containCheck (ArrayList<String> password) {
        boolean[] check = new boolean[password.size()];

        for (int i = 0; i < password.size(); i++) {
            String stringFromArray = password.get(i);
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean numberCase = false;
            boolean validation = true;

            for (int j = 0; j < stringFromArray.length(); j++) {
                char letter = stringFromArray.charAt(j);

                if (Character.isUpperCase(letter))
                    upperCase = true;
                else if (Character.isLowerCase(letter))
                    lowerCase = true;
                else if (Character.isDigit(letter))
                    numberCase = true;
                else
                    validation = false;
            }

            if (upperCase && numberCase && lowerCase && validation)
                check[i] = true;
            else
                check[i] = false;
        }


        return check;
    }

    public static void print (boolean[] lengthValidation, boolean[] passwordContainCheck) {
        for (int i = 0; i < lengthValidation.length; i++) {
            if (lengthValidation[i] && passwordContainCheck[i])
                System.out.println("Senha valida.");
            else
                System.out.println("Senha invalida.");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> password = new ArrayList<>();
        String input;

        while (sc.hasNextLine()) {
            input = sc.nextLine();
            password.add(input);
        }

        boolean[] lengthValidation = lengthCheck(password);
        boolean[] passwordContainCheck = containCheck(password);

        print(lengthValidation, passwordContainCheck);
    }
}
