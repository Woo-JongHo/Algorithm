import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // 개행문자 처리

        int[][] rectangle = new int[n][m];

        // 직사각형 입력 받기
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                rectangle[i][j] = line.charAt(j) - '0'; // 문자열을 숫자로 변환하여 저장
            }
        }

        // 가능한 모든 정사각형 탐색
        int maxSize = Math.min(n, m); // 정사각형의 최대 크기는 행 또는 열의 최소값
        int answer = 1; // 찾은 정사각형의 최소 크기는 1로 초기화
        boolean found = false; // 정사각형을 찾았는지 여부

        for (int size = maxSize; size > 1; size--) {
            for (int i = 0; i <= n - size; i++) {
                for (int j = 0; j <= m - size; j++) {
                    int topLeft = rectangle[i][j];
                    int topRight = rectangle[i][j + size - 1];
                    int bottomLeft = rectangle[i + size - 1][j];
                    int bottomRight = rectangle[i + size - 1][j + size - 1];

                    if (topLeft == topRight && topRight == bottomLeft && bottomLeft == bottomRight) {
                        answer = size * size; // 정사각형의 넓이 갱신
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) break;
        }

        System.out.println(answer);
    }
}
