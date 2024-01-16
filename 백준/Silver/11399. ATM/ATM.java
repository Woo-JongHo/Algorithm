import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사람의 수 N 입력
        int N = scanner.nextInt();

        // 각 사람이 돈을 인출하는데 걸리는 시간 Pi 입력
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        // 시간의 합을 최소로 만들기 위해 오름차순으로 정렬
        Arrays.sort(P);

        // 각 사람이 돈을 인출하는데 필요한 시간의 합 계산
        int totalTime = 0;
        for (int i = 0; i < N; i++) {
            totalTime += P[i] * (N - i);
        }

        // 결과 출력
        System.out.println(totalTime);
    }
}
