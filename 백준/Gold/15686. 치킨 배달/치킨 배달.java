import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] city;
    static ArrayList<Point> chickens = new ArrayList<>();
    static ArrayList<Point> homes = new ArrayList<>();
    static int result = Integer.MAX_VALUE;

    static class Point {
        int row, col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        N = scanner.nextInt();
        M = scanner.nextInt();
        city = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                city[i][j] = scanner.nextInt();
                if (city[i][j] == 1) {
                    homes.add(new Point(i, j));
                } else if (city[i][j] == 2) {
                    chickens.add(new Point(i, j));
                }
            }
        }

        // 치킨집 중에서 최대 M개 선택
        combination(0, 0, new ArrayList<>());

        // 결과 출력
        System.out.println(result);

        scanner.close();
    }

    // 치킨집 중에서 최대 M개를 선택하는 조합 구하기
    private static void combination(int start, int count, ArrayList<Point> selected) {
        if (count == M) {
            // 도시의 치킨 거리 계산
            calculateChickenDistance(selected);
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            selected.add(chickens.get(i));
            combination(i + 1, count + 1, selected);
            selected.remove(selected.size() - 1);
        }
    }

    // 도시의 치킨 거리 계산
    private static void calculateChickenDistance(ArrayList<Point> selected) {
        int totalDistance = 0;

        for (Point home : homes) {
            int minDistance = Integer.MAX_VALUE;

            for (Point chicken : selected) {
                int distance = Math.abs(home.row - chicken.row) + Math.abs(home.col - chicken.col);
                minDistance = Math.min(minDistance, distance);
            }

            totalDistance += minDistance;
        }

        // 최소 치킨 거리 갱신
        result = Math.min(result, totalDistance);
    }
}
