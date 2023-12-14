import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        // 수를 저장하는 스택 생성
        Stack<Integer> stack = new Stack<>();

        // 총 합을 저장하는 변수
        int sum = 0;

        // 명령 처리
        for (int i = 0; i < k; i++) {
            int num = scanner.nextInt();

            if (num == 0) {
                // 0이면 최근에 쓴 수를 지우고 그 수를 더하지 않음
                sum -= stack.pop();
            } else {
                // 0이 아니면 수를 쓰고 그 수를 더함
                stack.push(num);
                sum += num;
            }
        }

        // 결과 출력
        System.out.println(sum);
    }
}