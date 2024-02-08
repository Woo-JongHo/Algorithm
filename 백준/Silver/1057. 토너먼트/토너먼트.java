import java.util.*;



public class Main {

	private static Scanner sc = new Scanner(System.in);

	

	

	public static void main(String[] args) {

		int N = sc.nextInt();

		int kim = sc.nextInt();

		int lim = sc.nextInt();

		int cnt = 0;

		while(kim!=lim){

			kim = kim/2 + kim%2;

			lim = lim/2 + lim%2;

			cnt++;

		}

		System.out.print(cnt);

	}

}