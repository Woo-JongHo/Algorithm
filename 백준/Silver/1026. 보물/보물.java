import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 크기 입력
        int N = scanner.nextInt();

        // 배열 A 입력
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 배열 B 입력
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        // 배열 A를 오름차순으로 정렬
        Arrays.sort(A);

        // 배열 B를 내림차순으로 정렬
        Arrays.sort(B);

        // S의 최솟값 계산
        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i] * B[N - 1 - i];
        }

        // 결과 출력
        System.out.println(S);
    }
}
