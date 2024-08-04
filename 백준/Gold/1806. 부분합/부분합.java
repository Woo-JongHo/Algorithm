import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int minLength = Integer.MAX_VALUE; // 최소 길이를 저장할 변수
        int sum = 0; // 현재 부분합
        int start = 0; // 부분 수열의 시작 포인터

        // 두 포인터를 사용하여 부분합 탐색
        for (int end = 0; end < N; end++) {
            sum += array[end];

            // 현재 부분합이 S 이상인 경우, 최소 길이를 갱신하고 시작 포인터를 이동시켜 부분합을 줄여본다.
            while (sum >= S) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= array[start++];
            }
        }

        // 조건을 만족하는 부분 수열이 없는 경우 0을 출력
        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}
