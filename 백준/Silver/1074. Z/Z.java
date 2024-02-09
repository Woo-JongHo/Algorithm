import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        solve((int) Math.pow(2, N), r, c);

        System.out.println(result);
    }

    public static void solve(int size, int r, int c) {
        if (size == 1) return;

        int half = size / 2;

        if (r < half && c < half) {
            solve(half, r, c);
        } else if (r < half && c >= half) {
            result += half * half;
            solve(half, r, c - half);
        } else if (r >= half && c < half) {
            result += 2 * half * half;
            solve(half, r - half, c);
        } else {
            result += 3 * half * half;
            solve(half, r - half, c - half);
        }
    }
}
