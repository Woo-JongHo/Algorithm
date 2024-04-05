import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 종이의 가로와 세로 길이 입력 받기
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        // 종이를 자를 점선의 개수 입력 받기
        int n = scanner.nextInt();

        // 가로와 세로 점선 리스트 초기화
        ArrayList<Integer> verticalLines = new ArrayList<>();
        ArrayList<Integer> horizontalLines = new ArrayList<>();

        // 가로와 세로 점선 리스트에 번호 저장
        for (int i = 0; i < n; i++) {
            int direction = scanner.nextInt();
            int line = scanner.nextInt();
            if (direction == 0) {
                horizontalLines.add(line);
            } else {
                verticalLines.add(line);
            }
        }

        // 마지막 가로 및 세로 점선 추가 (가로는 끝까지, 세로는 세로 길이까지)
        horizontalLines.add(0);
        horizontalLines.add(height);
        verticalLines.add(0);
        verticalLines.add(width);

        // 가로와 세로 점선 리스트를 정렬
        Collections.sort(horizontalLines);
        Collections.sort(verticalLines);

        // 최대 넓이 계산
        int maxWidth = 0;
        for (int i = 0; i < horizontalLines.size() - 1; i++) {
            for (int j = 0; j < verticalLines.size() - 1; j++) {
                int widthBetween = verticalLines.get(j + 1) - verticalLines.get(j);
                int heightBetween = horizontalLines.get(i + 1) - horizontalLines.get(i);
                int area = widthBetween * heightBetween;
                maxWidth = Math.max(maxWidth, area);
            }
        }

        // 결과 출력
        System.out.println(maxWidth);
    }
}
