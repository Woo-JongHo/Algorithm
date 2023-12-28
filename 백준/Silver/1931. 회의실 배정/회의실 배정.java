import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int[][] time;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N =Integer.parseInt(br.readLine());	//회의의 최대개수 
				
		time = new int [N][2];
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			String[] s = br.readLine().split(" ");
			time[i][0]=Integer.parseInt(s[0]);	//회의 시작시간 
			time[i][1]=Integer.parseInt(s[1]);	//회의 종료시간
		}
		Arrays.sort(time,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]==o2[1] ? o1[0]-o2[0]:o1[1]-o2[1];
			}
		});
		
		int prev=0;
		for(int i=0;i<N;i++) {
			if(prev<=time[i][0]) {
				prev=time[i][1];
				cnt++;
			}
		}

		System.out.println(cnt);
		br.close(); 
		 
    }
	
}
