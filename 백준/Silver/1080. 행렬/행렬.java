import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        char[][] A = new char[N][M];
        char[][] B = new char[N][M];

        // A 행렬 입력 받기
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                A[i][j] = line.charAt(j);
            }
        }

        // B 행렬 입력 받기
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                B[i][j] = line.charAt(j);
            }
        }

        int answer = solution(N, M, A, B);
        System.out.println(answer);
    }

    public static int solution(int N, int M, char[][] A, char[][] B) {
        int count = 0;

        // A를 B로 바꾸기 위한 연산 수행
        for (int i = 0; i <= N - 3; i++) {
            for (int j = 0; j <= M - 3; j++) {
                if (A[i][j] != B[i][j]) {
                    flip(A, i, j);
                    count++;
                }
            }
        }

        // 모든 원소가 같은지 확인
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] != B[i][j]) {
                    return -1; // A를 B로 바꿀 수 없는 경우
                }
            }
        }

        return count;
    }

    public static void flip(char[][] A, int row, int col) {
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                A[i][j] = (A[i][j] == '0') ? '1' : '0';
            }
        }
    }
}
