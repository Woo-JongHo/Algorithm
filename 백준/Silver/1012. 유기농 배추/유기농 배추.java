import java.util.Scanner;

public class Main {
    static int[][] field;
    static boolean[][] visited;
    static int M, N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            M = sc.nextInt();
            N = sc.nextInt();
            int K = sc.nextInt();

            field = new int[M][N];
            visited = new boolean[M][N];

            for (int k = 0; k < K; k++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                field[X][Y] = 1;
            }

            int wormCount = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        wormCount++;
                    }
                }
            }

            System.out.println(wormCount);
        }
    }

    static void dfs(int x, int y) {
        if (x < 0 || x >= M || y < 0 || y >= N || visited[x][y] || field[x][y] == 0) return;
        
        visited[x][y] = true;

        dfs(x + 1, y);
        dfs(x - 1, y);
        dfs(x, y + 1);
        dfs(x, y - 1);
    }
}
