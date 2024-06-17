import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        System.out.println(minAdditionalBottles(N, K));
    }

    public static int minAdditionalBottles(int N, int K) {
        int additionalBottles = 0;

        while (Integer.bitCount(N) > K) {
            N += 1;
            additionalBottles += 1;
        }

        return additionalBottles;
    }
}
