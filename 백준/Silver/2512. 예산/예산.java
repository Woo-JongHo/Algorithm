import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] requests = new int[n];
        int totalBudget = 0;
        
        // 입력 받기
        for (int i = 0; i < n; i++) {
            requests[i] = scanner.nextInt();
            totalBudget += requests[i];
        }
        
        int m = scanner.nextInt(); // 총 예산
        
        // 이분 탐색을 위한 시작점과 끝점 설정
        int start = 0;
        int end = Arrays.stream(requests).max().getAsInt();
        int result = 0;
        
        // 이분 탐색
        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            
            // 상한액 이하의 예산 요청의 합 구하기
            for (int request : requests) {
                sum += Math.min(request, mid);
            }
            
            // 총 예산과 비교하여 상한액 조정
            if (sum <= m) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        // 결과 출력
        System.out.println(result);
    }
}
