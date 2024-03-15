import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 상근이가 집으로 가져가려고 하는 나무의 길이

        int[] trees = new int[N]; // 나무의 높이를 저장할 배열
        st = new StringTokenizer(br.readLine());
        int maxHeight = 0; // 절단기에 설정할 수 있는 높이의 최댓값을 저장할 변수
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            maxHeight = Math.max(maxHeight, trees[i]); // 최댓값 갱신
        }

        int left = 0; // 이분 탐색의 왼쪽 경계
        int right = maxHeight; // 이분 탐색의 오른쪽 경계
        int result = 0; // 절단기에 설정할 수 있는 높이의 최댓값

        // 이분 탐색 시작
        while (left <= right) {
            int mid = (left + right) / 2; // 중간 높이 설정
            long total = 0; // 절단된 나무의 총 길이

            // 중간 높이로 나무를 절단하여 총 길이를 계산
            for (int tree : trees) {
                if (tree > mid) {
                    total += tree - mid;
                }
            }

            // 상근이가 집으로 가져가려는 나무의 길이보다 크거나 같으면 결과 갱신 후 더 높은 높이 탐색
            if (total >= M) {
                result = mid;
                left = mid + 1;
            }
            // 상근이가 집으로 가져가려는 나무의 길이보다 작으면 더 낮은 높이 탐색
            else {
                right = mid - 1;
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
