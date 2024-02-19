import java.util.*;

public class Main {
    static int k;
    static char[] signs;
    static boolean[] visited;
    static ArrayList<String> results;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        signs = new char[k];
        visited = new boolean[10];
        results = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            signs[i] = sc.next().charAt(0);
        }

        findNumbers(0, new StringBuilder());

        Collections.sort(results);

        System.out.println(results.get(results.size() - 1));
        System.out.println(results.get(0));
    }

    static void findNumbers(int depth, StringBuilder sb) {
        if (depth == k + 1) {
            results.add(sb.toString());
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (!visited[i] && (depth == 0 || checkCondition(sb.charAt(depth - 1) - '0', i, signs[depth - 1]))) {
                visited[i] = true;
                findNumbers(depth + 1, new StringBuilder(sb).append(i));
                visited[i] = false;
            }
        }
    }

    static boolean checkCondition(int prev, int next, char sign) {
        if (sign == '<') {
            return prev < next;
        } else {
            return prev > next;
        }
    }
}
