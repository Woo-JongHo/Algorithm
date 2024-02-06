import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 보드의 행 개수
        int M = scanner.nextInt(); // 보드의 열 개수
        scanner.nextLine(); // 개행문자 소비

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int minRepaint = Integer.MAX_VALUE; // 최소 다시 칠해야 하는 개수를 저장할 변수

        // (0,0)부터 (N-8, M-8)까지 가능한 모든 8x8 정사각형을 확인
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minRepaint = Math.min(minRepaint, countRepaint(board, i, j)); // 최소 다시 칠하는 개수 갱신
            }
        }

        System.out.println(minRepaint); // 결과 출력
    }

    // 주어진 시작 위치와 보드에서 다시 칠해야 하는 개수를 세는 메서드
    private static int countRepaint(char[][] board, int startX, int startY) {
        int repaint1 = 0; // 'W'로 시작하는 경우의 다시 칠하는 개수
        int repaint2 = 0; // 'B'로 시작하는 경우의 다시 칠하는 개수

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                // 현재 위치에 'W'나 'B'가 와야 하는지 확인하여 다시 칠하는 개수 증가
                if ((i + j) % 2 == 0) {
                    // 'W'로 시작하는 경우
                    if (board[i][j] == 'B') {
                        repaint1++;
                    } else {
                        repaint2++;
                    }
                } else {
                    // 'B'로 시작하는 경우
                    if (board[i][j] == 'W') {
                        repaint1++;
                    } else {
                        repaint2++;
                    }
                }
            }
        }
        // 두 경우 중에서 최소 다시 칠하는 개수 반환
        return Math.min(repaint1, repaint2);
    }
}
