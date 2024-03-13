import java.util.*;

class Main {
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 방향
    static int[] dy = {0, 0, -1, 1};
    
    static class Point {
        int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        
        int answer = bfs(maze, n, m);
        System.out.println(answer);
    }
    
    static int bfs(int[][] maze, int n, int m) {
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        queue.offer(new Point(0, 0));
        visited[0][0] = true;
        int count = 1; // 시작 위치도 포함
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point current = queue.poll();
                int x = current.x;
                int y = current.y;
                
                if (x == n - 1 && y == m - 1) { // 도착점에 도착했을 때
                    return count;
                }
                
                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                        if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                            queue.offer(new Point(nx, ny));
                            visited[nx][ny] = true;
                        }
                    }
                }
            }
            count++; // 다음 칸으로 이동
        }
        return -1; // 도착점에 도착할 수 없는 경우
    }
}
