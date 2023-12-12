import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 다솜이의 방 번호 입력 받기
        String roomNumber = scanner.nextLine();

        // 필요한 세트의 개수 계산
        int[] count = new int[10];
        for (int i = 0; i < roomNumber.length(); i++) {
            int num = roomNumber.charAt(i) - '0';
            if (num == 9) num = 6; // 9는 6으로 대체하여 처리
            count[num]++;
        }

        // 6의 개수를 2로 나누고, 나머지가 있는 경우에는 1을 더함
        count[6] = (count[6] + 1) / 2;

        // 필요한 세트의 개수 출력
        int result = 0;
        for (int i = 0; i < 9; i++) {
            result = Math.max(result, count[i]);
        }

        System.out.println(result);
    }
}