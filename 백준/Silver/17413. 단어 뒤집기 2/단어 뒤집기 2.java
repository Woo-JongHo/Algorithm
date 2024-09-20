import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        Stack<Character> wordStack = new Stack<>();
        boolean insideTag = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '<') {
                while (!wordStack.isEmpty()) {
                    result.append(wordStack.pop());
                }
                insideTag = true;
                result.append(ch);
            } else if (ch == '>') {
                insideTag = false;
                result.append(ch);
            } else if (insideTag) {
                result.append(ch);
            } else {
                if (ch == ' ') {
                    while (!wordStack.isEmpty()) {
                        result.append(wordStack.pop());
                    }
                    result.append(ch);
                } else {
                    wordStack.push(ch);
                }
            }
        }

        while (!wordStack.isEmpty()) {
            result.append(wordStack.pop());
        }

        System.out.println(result.toString());
    }
}
