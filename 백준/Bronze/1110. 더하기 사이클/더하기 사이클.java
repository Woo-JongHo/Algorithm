import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int originalN = N; // 초기 입력값을 저장해둠
        int cycle = 0;

        do {
            int sum = (N / 10 + N % 10) % 10; // 각 자리 숫자의 합을 구하고 오른쪽 자리 수만 남김
            N = (N % 10) * 10 + sum; // 새로운 수를 만듦
            cycle++;
        } while (N != originalN);

        System.out.println(cycle);
    }
}
