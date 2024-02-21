import java.util.Scanner;

public class Main {

    static int[][] dp = new int[41][2];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        dp[0][0] = 1;    // N=0 일 때의 0 호출 횟수
        dp[0][1] = 0;    // N=0 일 때의 1 호출 횟수
        dp[1][0] = 0;    // N=1 일 때의 0 호출 횟수
        dp[1][1] = 1;    // N=1 일 때의 1 호출 횟수

        int T = in.nextInt();

        while (T-- > 0) {
            int N = in.nextInt();
            fibonacci(N);
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }

    }

    static int[] fibonacci(int N) {
        // N에 대한 0, 1의 호출 횟수가 없을 때(탐색하지 않은 값일 때)
        if (dp[N][0] == 0 && dp[N][1] == 0) {
            // 각 N에 대한 0 호출 횟수와 1 호출 횟수를 반복문을 이용하여 계산한다.
            for (int i = 2; i <= N; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            }
        }
        // N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고있는 [N]을 반환한다.
        return dp[N];

    }

}
