import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static char[] characters;
    static char[] password;
    static int L, C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();

        characters = new char[C];
        password = new char[L];

        for (int i = 0; i < C; i++) {
            characters[i] = sc.next().charAt(0);
        }

        Arrays.sort(characters);

        generatePassword(0, 0);

        sc.close();
    }

    private static void generatePassword(int start, int depth) {
        if (depth == L) {
            if (isValidPassword()) {
                System.out.println(new String(password));
            }
            return;
        }

        for (int i = start; i < C; i++) {
            password[depth] = characters[i];
            generatePassword(i + 1, depth + 1);
        }
    }

    private static boolean isValidPassword() {
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : password) {
            if (isVowel(c)) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        return vowelCount >= 1 && consonantCount >= 2;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
