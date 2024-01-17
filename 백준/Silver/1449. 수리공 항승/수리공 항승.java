import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(arr);
		
		int gasu = 1;
		
		int idx = 0;
		for(int i = 1; i < N; i ++) {
			
			if(arr[i] - arr[idx] > L - 1) {
				idx = i;
				gasu++;
			}
		}
		
		System.out.println(gasu);
	}
}