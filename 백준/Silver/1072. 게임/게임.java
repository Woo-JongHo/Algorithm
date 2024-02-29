import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        
        long Z = (Y * 100) / X; // 이긴 게임 비율
        
        if (Z >= 99) {
            System.out.println(-1); // Z가 변하지 않는 경우
            return;
        }
        
        long left = 0;
        long right = 1000000000; // 제한된 범위 내에서 탐색
        
        while (left < right) {
            long mid = (left + right) / 2;
            long newZ = ((Y + mid) * 100) / (X + mid); // 새로운 이긴 게임 비율
            
            if (newZ > Z) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        System.out.println(left);
    }
}
