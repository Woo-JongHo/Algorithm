import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N + 1];
        int[] P = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        // 동적 프로그래밍을 위한 배열 초기화
        int[] dp = new int[N + 2];

        // 최대 이익 계산
        for (int i = N; i >= 1; i--) {
            int nextDay = i + T[i];

            // 퇴사 전까지 가능한 상담 중에서 최대 이익을 선택
            dp[i] = Math.max(dp[i + 1], nextDay <= N + 1 ? P[i] + dp[nextDay] : 0);
        }

        // 결과 출력
        System.out.println(dp[1]);
    }
}
