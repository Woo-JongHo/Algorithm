import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int[] S = new int[L];
        for (int i = 0; i < L; i++) {
            S[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        Arrays.sort(S);

        if (Arrays.binarySearch(S, n) >= 0) {
            System.out.println(0);
        } else {
            int count = 0;
            int minN = 0;
            int maxN = 0;
            for (int i : S) {
                if (i < n) {
                    minN = i;
                } else if (i > n) {
                    maxN = i;
                    break;
                }
            }

            for (int i = minN + 1; i < maxN; i++) {
                for (int j = i + 1; j < maxN; j++) {
                    if (i <= n && j >= n) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
