import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 색종이 수 입력 받기
        int n = sc.nextInt();
        
        // 100x100 도화지를 0으로 초기화
        boolean[][] canvas = new boolean[100][100];
        
        // 각 색종이의 위치를 입력 받아서 도화지에 표시
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // 색종이의 크기는 10x10
            for (int dx = 0; dx < 10; dx++) {
                for (int dy = 0; dy < 10; dy++) {
                    canvas[x + dx][y + dy] = true;
                }
            }
        }
        
        // 검은 영역의 넓이를 계산
        int blackArea = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (canvas[i][j]) {
                    blackArea++;
                }
            }
        }
        
        // 결과 출력
        System.out.println(blackArea);
        
        sc.close();
    }
}
