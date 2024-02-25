import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            // 두 터렛 사이의 거리
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // 두 터렛의 반지름과 거리로 류재명이 있을 수 있는 위치의 수 판단
            if (distance == 0 && r1 == r2) { // 두 터렛이 같은 위치에 있고 반지름도 같을 때
                System.out.println(-1);
            } else if (distance > r1 + r2 || distance < Math.abs(r1 - r2)) { // 두 터렛이 겹치지 않을 때
                System.out.println(0);
            } else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) { // 두 터렛이 한 점에서 만날 때
                System.out.println(1);
            } else { // 두 터렛이 두 점에서 만날 때
                System.out.println(2);
            }
        }
    }
}
