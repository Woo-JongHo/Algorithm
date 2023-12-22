import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main {
    static long[] stack;
    static int pos = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        stack = new long[n + 1];
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long building = Long.parseLong(bf.readLine());
            while(pos!=0 && top() <= building) pop();
            push(building);
            sum += pos - 1;
        }
        System.out.println(sum);
        bf.close();
    }

    static void push(long x) {
        stack[pos++] = x;
    }

    static void pop() {
        pos--;
    }

    static long top() {
        return stack[pos - 1];
    }

}