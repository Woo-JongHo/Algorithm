import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] T = new int[N + 1];
        int[] P = new int[N + 1];
        int[] dp = new int[N + 2]; // dp 배열 초기화

        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        for (int i = N; i >= 1; i--) {
            int next = i + T[i];

            // 퇴사 전까지 상담이 가능한 경우
            if (next <= N + 1) {
                dp[i] = Math.max(P[i] + dp[next], dp[i + 1]);
            } else {
                // 퇴사 전에 끝나는 상담이 불가능한 경우
                dp[i] = dp[i + 1];
            }
        }

        System.out.println(dp[1]); // 최대 이익 출력
    }
}
