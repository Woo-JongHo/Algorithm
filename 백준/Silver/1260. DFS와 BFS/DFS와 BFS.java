import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 정점의 개수
        int M = scanner.nextInt(); // 간선의 개수
        int V = scanner.nextInt(); // 탐색을 시작할 정점의 번호

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        boolean[] visited = new boolean[N + 1];
        List<Integer> dfsResult = new ArrayList<>();
        dfs(V, graph, visited, dfsResult);

        visited = new boolean[N + 1];
        List<Integer> bfsResult = bfs(V, graph, visited);

        for (int node : dfsResult) {
            System.out.print(node + " ");
        }
        System.out.println();

        for (int node : bfsResult) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

    public static void dfs(int current, List<List<Integer>> graph, boolean[] visited, List<Integer> result) {
        visited[current] = true;
        result.add(current);

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, result);
            }
        }
    }

    public static List<Integer> bfs(int start, List<List<Integer>> graph, boolean[] visited) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        return result;
    }
}
