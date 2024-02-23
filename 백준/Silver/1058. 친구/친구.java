import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        char[][] friendship = new char[n][n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                friendship[i][j] = line.charAt(j);
            }
        }

        // 2-친구 수 구하기
        int maxTwoFriends = 0;
        for (int i = 0; i < n; i++) {
            int twoFriends = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // 같은 사람은 제외
                if (friendship[i][j] == 'Y') { // 직접 친구인 경우
                    twoFriends++;
                } else { // 직접 친구가 아닌 경우, 간접 친구 확인
                    for (int k = 0; k < n; k++) {
                        if (friendship[i][k] == 'Y' && friendship[k][j] == 'Y') {
                            twoFriends++;
                            break;
                        }
                    }
                }
            }
            maxTwoFriends = Math.max(maxTwoFriends, twoFriends);
        }

        System.out.println(maxTwoFriends);
    }
}
