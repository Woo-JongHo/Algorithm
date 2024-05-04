import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        boolean[] arr = new boolean[1002];
        ArrayList<Integer> v = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            arr[a] = true;
        }

        for (int i = 1; i < 1002; i++) {
            if (!arr[i]) v.add(i);
        }

        int result = Integer.MAX_VALUE;
        int sz = v.size();
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                for (int k = 0; k < sz; k++) {
                    int q = v.get(i) * v.get(j) * v.get(k);
                    if (Math.abs(N - q) < result) result = Math.abs(N - q);
                    if (N + 1 < q) break;
                }
            }
        }
        System.out.println(result);
    }
}
