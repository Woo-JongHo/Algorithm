import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static class Stack {
        private ArrayList<Integer> stack;

        public Stack() {
            stack = new ArrayList<>();
        }

        public void push(int x) {
            stack.add(x);
        }

        public int pop() {
            if (!stack.isEmpty()) {
                return stack.remove(stack.size() - 1);
            } else {
                return -1;
            }
        }

        public int size() {
            return stack.size();
        }

        public int empty() {
            return stack.isEmpty() ? 1 : 0;
        }

        public int top() {
            if (!stack.isEmpty()) {
                return stack.get(stack.size() - 1);
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            int cmd = Integer.parseInt(command[0]);
            switch (cmd) {
                case 1:
                    int x = Integer.parseInt(command[1]);
                    stack.push(x);
                    break;
                case 2:
                    output.append(stack.pop()).append("\n");
                    break;
                case 3:
                    output.append(stack.size()).append("\n");
                    break;
                case 4:
                    output.append(stack.empty()).append("\n");
                    break;
                case 5:
                    output.append(stack.top()).append("\n");
                    break;
            }
        }
        System.out.print(output); 
    }
}
