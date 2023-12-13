import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 정수를 저장하는 스택 생성
        Stack<Integer> stack = new Stack<>();

        StringBuilder result = new StringBuilder();

        // 명령 처리
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        result.append("-1\n");
                    } else {
                        result.append(stack.pop()).append("\n");
                    }
                    break;
                case "size":
                    result.append(stack.size()).append("\n");
                    break;
                case "empty":
                    result.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        result.append("-1\n");
                    } else {
                        result.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }

        // 결과 출력
        System.out.print(result.toString());
    }
}