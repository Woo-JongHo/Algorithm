import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트케이스 개수

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // 건물의 개수
            int K = scanner.nextInt(); // 건물간 건설 순서 규칙의 총 개수

            int[] time = new int[N + 1]; // 건물당 건설 시간
            int[] inDegree = new int[N + 1]; // 진입 차수
            List<Integer>[] graph = new List[N + 1]; // 연결 리스트 그래프
            int[] result = new int[N + 1]; // 각 건물이 건설되기까지의 최소 시간

            // 그래프 초기화
            for (int i = 1; i <= N; i++) {
                graph[i] = new ArrayList<>();
            }

            // 건설 시간 입력
            for (int i = 1; i <= N; i++) {
                time[i] = scanner.nextInt();
            }

            // 건설 순서 입력 및 그래프 구성
            for (int i = 0; i < K; i++) {
                int X = scanner.nextInt();
                int Y = scanner.nextInt();
                graph[X].add(Y);
                inDegree[Y]++;
            }

            // 건설해야 할 건물 번호
            int W = scanner.nextInt();

            // 위상 정렬
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                    result[i] = time[i];
                }
            }

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int next : graph[current]) {
                    result[next] = Math.max(result[next], result[current] + time[next]);
                    inDegree[next]--;

                    if (inDegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }

            // 결과 출력
            System.out.println(result[W]);
        }
    }
}
