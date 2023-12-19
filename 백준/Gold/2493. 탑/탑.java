import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stz = new StringTokenizer(br.readLine());
		Stack<int[]> st = new Stack<>();
		
		for(int n = 1; n <= N; n++) {
			int current = Integer.parseInt(stz.nextToken()); // 현재 탑의 높이
			while(!st.empty()) {
				if(st.peek()[1] < current) st.pop(); // 이전 탑의 높이가 현재 높이보다 작으면 필요 없으므로 pop
				else { // 이전 탑의 높이가 현재 높이보다 크면 여기에 수신하므로 이전 탑의 높이 출력
					System.out.print(st.peek()[0] + " ");
					break;
				}
			}
			if(st.isEmpty()) System.out.print("0 "); // 스택이 비었다는 것은 수신할 탑이 없다는 뜻이므로 0 출력
			st.push(new int[] {n, current}); // 다음 탑과의 비교를 위해 현재 탑도 push (탑의 위치, 탑의 높이)순서임
		}
	}
}