import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // 열의 수
        int n = scanner.nextInt(); // 행의 수
        int[][] box = new int[n][m]; // 상자

        Queue<int[]> ripe = new LinkedList<>(); // 익은 토마토 위치를 저장할 큐

        // 상자 정보 입력받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = scanner.nextInt();
                if (box[i][j] == 1) {
                    ripe.offer(new int[]{i, j});
                }
            }
        }

        int days = bfs(box, ripe, n, m);
        System.out.println(days);
    }

    static int bfs(int[][] box, Queue<int[]> ripe, int n, int m) {
        int days = -1;
        while (!ripe.isEmpty()) {
            days++;
            int size = ripe.size();
            for (int i = 0; i < size; i++) {
                int[] tomato = ripe.poll();
                int x = tomato[0];
                int y = tomato[1];
                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
                        box[nx][ny] = 1; // 익은 토마토로 변경
                        ripe.offer(new int[]{nx, ny}); // 다음 토마토를 익히기 위해 큐에 추가
                    }
                }
            }
        }

        // 모든 토마토가 익은 경우
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    return -1;
                }
            }
        }

        return days;
    }
}
