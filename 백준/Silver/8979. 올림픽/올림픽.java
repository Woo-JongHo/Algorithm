import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 국가의 수
        int K = scanner.nextInt();  // 알고 싶은 국가

        int[][] countries = new int[N][4];  // 국가별 메달 정보를 저장할 배열

        // 각 국가의 메달 정보를 입력받음
        for (int i = 0; i < N; i++) {
            countries[i][0] = scanner.nextInt();  // 국가 번호
            countries[i][1] = scanner.nextInt();  // 금메달 수
            countries[i][2] = scanner.nextInt();  // 은메달 수
            countries[i][3] = scanner.nextInt();  // 동메달 수
        }

        // 국가들을 등수에 따라 정렬
        sortCountries(countries);

        // 입력으로 주어진 국가의 등수를 출력
        for (int i = 0; i < N; i++) {
            if (countries[i][0] == K) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    // 국가를 등수에 따라 정렬하는 메서드
    private static void sortCountries(int[][] countries) {
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = 0; j < countries.length - 1 - i; j++) {
                // 국가의 등수를 계산하여 비교
                int rank1 = calculateRank(countries[j]);
                int rank2 = calculateRank(countries[j + 1]);

                if (rank1 < rank2 || (rank1 == rank2 && countries[j][0] > countries[j + 1][0])) {
                    // 더 높은 등수이거나, 등수가 같으면 국가 번호가 낮은 순으로 정렬
                    swap(countries, j, j + 1);
                }
            }
        }
    }

    // 국가의 등수를 계산하는 메서드
    private static int calculateRank(int[] country) {
        return country[1] * 1000000 + country[2] * 1000 + country[3];
    }

    // 배열에서 두 행을 교환하는 메서드
    private static void swap(int[][] array, int i, int j) {
        int[] temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
