import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int current = 1;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            while (current <= num) {
                stack.push(current);
                result.append("+\n");
                current++;
            }

            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                result.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(result.toString());
    }
}