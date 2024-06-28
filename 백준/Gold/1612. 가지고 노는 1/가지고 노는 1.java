import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        // n이 2 또는 5로 나누어 떨어지면 -1을 출력하고 종료
        if (n % 2 == 0 || n % 5 == 0) {
            System.out.println(-1);
            return;
        }

        // j는 1로 시작
        int j = 0;

        // i는 1부터 시작하여 조건을 만족하는 가장 작은 i를 찾는다
        for (int i = 1;; i++) {
            j = (10 * j + 1) % n;
            if (j == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
