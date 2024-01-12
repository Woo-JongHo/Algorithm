import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과일의 개수 N과 초기 길이 L 입력
        int N = sc.nextInt();
        int L = sc.nextInt();

        // 과일의 높이를 저장할 배열
        int[] heights = new int[N];

        // 과일의 높이 입력
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }

        // 높이를 오름차순으로 정렬
        Arrays.sort(heights);

        // 스네이크버드의 최대 길이 계산
        int maxSnakebirdLength = L;

        for (int i = 0; i < N; i++) {
            // 현재 과일의 높이가 스네이크버드의 길이보다 작거나 같으면 먹을 수 있음
            if (heights[i] <= maxSnakebirdLength) {
                maxSnakebirdLength++;  // 스네이크버드의 길이 증가
            } else {
                break;  // 높이가 스네이크버드의 길이보다 큰 과일은 이후에도 먹을 수 없음
            }
        }

        // 결과 출력
        System.out.println(maxSnakebirdLength);

        // 스캐너 닫기
        sc.close();
    }
}
