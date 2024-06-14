import java.util.Scanner;

public class Main {
    // 두 숫자의 최대공약수를 구하는 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int G = scanner.nextInt();  // 최대공약수
        int L = scanner.nextInt();  // 최소공배수

        int A = G, B = L;
        int minSum = A + B;

        int product = L / G; // a * b 값

        for (int i = 1; i * i <= product; i++) {
            if (product % i == 0) {
                int a = i;
                int b = product / i;
                // a와 b가 서로소인지 확인
                if (gcd(a, b) == 1) {
                    int candidateA = G * a;
                    int candidateB = G * b;
                    int sum = candidateA + candidateB;
                    if (sum < minSum) {
                        minSum = sum;
                        A = candidateA;
                        B = candidateB;
                    }
                }
            }
        }

        // A와 B를 오름차순으로 출력
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }
        System.out.println(A + " " + B);
    }
}
