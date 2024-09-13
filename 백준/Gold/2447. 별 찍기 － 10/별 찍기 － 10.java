import java.util.Scanner;

public class Main {
    static char[][] map;

      public static void drawStars(int x, int y, int n) {
        if (n == 1) {
            map[x][y] = '*';
            return;
        }

        int div = n / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                drawStars(x + i * div, y + j * div, div);
            }
        }
    }
         
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = ' ';
            }
        }

        drawStars(0, 0, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

  
}
