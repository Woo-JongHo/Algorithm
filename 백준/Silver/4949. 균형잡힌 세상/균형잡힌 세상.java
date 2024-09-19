import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String line = scanner.nextLine();
            if (line.equals(".")) {
                break;
            }
            
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (char ch : line.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isBalanced = false;
                        break;
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isBalanced = false;
                        break;
                    }
                }
            }
            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        scanner.close();
    }
}
