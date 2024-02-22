import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 개수
        
        for (int t = 0; t < T; t++) {
            int x1 = scanner.nextInt(); // 출발점 x 좌표
            int y1 = scanner.nextInt(); // 출발점 y 좌표
            int x2 = scanner.nextInt(); // 도착점 x 좌표
            int y2 = scanner.nextInt(); // 도착점 y 좌표
            
            int n = scanner.nextInt(); // 행성계의 개수
            int count = 0; // 행성계 진입/이탈 횟수
            
            for (int i = 0; i < n; i++) {
                int cx = scanner.nextInt(); // 행성계 중점 x 좌표
                int cy = scanner.nextInt(); // 행성계 중점 y 좌표
                int r = scanner.nextInt(); // 행성계 반지름
                
                // 출발점과 도착점이 행성계 내부에 있는지 확인
                boolean startInside = isInside(x1, y1, cx, cy, r);
                boolean endInside = isInside(x2, y2, cx, cy, r);
                
                // 출발점과 도착점이 행성계 내부에 동시에 있는 경우는 제외
                if (startInside && endInside) continue;
                
                // 출발점과 도착점이 행성계 경계를 기준으로 서로 다른 위치에 있는 경우
                // 혹은 출발점과 도착점이 행성계 경계 내부와 외부에 있는 경우
                if (startInside != endInside) {
                    count++; // 행성계 진입/이탈 횟수 증가
                }
            }
            
            System.out.println(count);
        }
    }
    
    // 점 (x, y)가 중심이 (cx, cy)이고 반지름이 r인 원 내부에 있는지 확인하는 메소드
    public static boolean isInside(int x, int y, int cx, int cy, int r) {
        // 두 점 사이의 거리가 반지름보다 작거나 같으면 원 내부에 있는 것으로 판단
        return Math.pow(x - cx, 2) + Math.pow(y - cy, 2) <= Math.pow(r, 2);
    }
}
