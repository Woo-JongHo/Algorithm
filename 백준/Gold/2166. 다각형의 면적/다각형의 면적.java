import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2]; // 배열 크기 수정

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1L * arr[i][0] * arr[(i + 1) % n][1] - 1L * arr[(i + 1) % n][0] * arr[i][1];
        }

        double area = Math.abs(sum) / 2.0; // 결과를 double로 변환

        System.out.printf("%.1f\n", area); // 결과 출력
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
