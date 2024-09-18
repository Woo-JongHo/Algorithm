import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        List<List<Integer>> tree = new ArrayList<>(N + 1);
        
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }
        
        for (int i = 0; i < N - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        
        int[] parents = new int[N + 1];
        boolean[] visited = new boolean[N + 1];
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : tree.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parents[neighbor] = current;
                    queue.add(neighbor);
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
        
    }
}
