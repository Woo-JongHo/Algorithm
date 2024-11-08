import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1: 
                    int x1 = Integer.parseInt(st.nextToken());
                    deque.addFirst(x1);
                    break;
                case 2:
                    int x2 = Integer.parseInt(st.nextToken());
                    deque.addLast(x2);
                    break;
                case 3: 
                    sb.append(deque.isEmpty() ? -1 : deque.removeFirst()).append("\n");
                    break;
                case 4: 
                    sb.append(deque.isEmpty() ? -1 : deque.removeLast()).append("\n");
                    break;
                case 5: 
                    sb.append(deque.size()).append("\n");
                    break;
                case 6: 
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7: 
                    sb.append(deque.isEmpty() ? -1 : deque.getFirst()).append("\n");
                    break;
                case 8: 
                    sb.append(deque.isEmpty() ? -1 : deque.getLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
