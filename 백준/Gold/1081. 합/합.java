import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			// 입력을 공백을 기준으로 나누어 읽기
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String n = st.nextToken();
			String m = st.nextToken();
			
			// m과 n의 페이지 수의 차이를 계산
			long temp = page(m) - page(n);
			
			// n의 각 자리 숫자를 더함
			for (int i = 0; i < n.length(); i++) {
				temp += n.charAt(i) - '0';
			}
			
			System.out.println(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static long page(String N) {
		long returnVal = 0;
		long[] page = new long[10];
		long[] prev = new long[10];
		long[] ans = new long[10];

		int len = N.length();
		ArrayList<long[]> index = new ArrayList<>();
		index.add(page.clone());
		long cnt = 1;

		// 전처리 과정
		for (int i = 0; i <= len; i++) {
			for (int j = 0; j <= 9; j++) {
				page[j] *= 10;
				page[j] += cnt;
			}
			index.add(page.clone());
			cnt *= 10;
		}
		
		// 자리별 계산
		for (int i = 0; i < N.length(); i++, len--) {
			int cur = N.charAt(i) - '0';
			long[] curIdx = index.get(len - 1);
			long repeat = (long) Math.pow(10, len - 1);
			for (int j = 0; j <= 9; j++) {
				ans[j] += curIdx[j] * cur;
				ans[j] += prev[j] * repeat * cur;  // 이전 자리 처리
			}
			
			// 가장 앞자리 처리
			for (int j = 0; j < cur; j++) {
				ans[j] += repeat;
			}
			
			prev[cur]++;
		}
		
		// 최종 계산
		for (int j = 0; j <= 9; j++) {
			ans[j] += prev[j];
		}
		for (int i = 0; i < N.length(); i++) {
			ans[0] -= Math.pow(10, i);
		}
		for (int i = 0; i <= 9; i++) {
			returnVal += i * ans[i];
		}
		return returnVal;
	}
}
