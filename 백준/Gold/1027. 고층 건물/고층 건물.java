import java.util.Scanner;

public class Main {

    // 두 빌딩 사이의 기울기를 계산하는 함수
    public static double slope(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 빌딩의 수
        int[] buildings = new int[N];  // 빌딩의 높이를 저장하는 배열

        for (int i = 0; i < N; i++) {
            buildings[i] = scanner.nextInt();
        }

        int result = 0;  // 가장 많이 보이는 빌딩의 수

        for (int i1 = 0; i1 < N; i1++) {
            int x1 = i1 + 1;
            int y1 = buildings[i1];

            // 오른쪽에서 보이는 빌딩 수 계산
            double curSlopeRight = Double.NEGATIVE_INFINITY;
            int visibleRight = 0;
            for (int i2 = i1 + 1; i2 < N; i2++) {
                int x2 = i2 + 1;
                int y2 = buildings[i2];
                double slopeRight = slope(x1, y1, x2, y2);

                if (slopeRight > curSlopeRight) {
                    curSlopeRight = slopeRight;
                    visibleRight++;
                }
            }

            // 왼쪽에서 보이는 빌딩 수 계산
            double curSlopeLeft = Double.POSITIVE_INFINITY;
            int visibleLeft = 0;
            for (int i3 = i1 - 1; i3 >= 0; i3--) {
                int x2 = i3 + 1;
                int y2 = buildings[i3];
                double slopeLeft = slope(x1, y1, x2, y2);

                if (slopeLeft < curSlopeLeft) {
                    curSlopeLeft = slopeLeft;
                    visibleLeft++;
                }
            }

            // 현재 빌딩에서 보이는 빌딩 수의 합을 계산하고 최대값 갱신
            result = Math.max(result, visibleLeft + visibleRight);
        }

        System.out.println(result);
    }
}
