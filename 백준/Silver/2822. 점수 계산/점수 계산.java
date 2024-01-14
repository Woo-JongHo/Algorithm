import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;			// 점수 합계 변수 생성 
		int arr[][] = new int[8][2]; // 배열 생성 
		int arr2[] = new int[5];	 // 가장 높은 점수의 번호 5개를 저장할 배열

		for(int i=0; i<8; i++) {    // 반복문
			arr[i][0] = sc.nextInt();   // 점수 입력받기 
			arr[i][1] = i+1;			// 문제 번호 배열에 넣기 
		}

		Arrays.sort(arr, new Comparator<int[]>() {    // 2차원 배열 내림차순으로 정렬 
			@Override
			public int compare(int[] a, int[] b) {
				return b[0] - a[0];
			}
		});
		
		for(int i=0; i< 5; i++) {		// 반복문
			sum += arr[i][0];			// sum에 점수를 저장했던 배열의 값을 저장
			arr2[i] = arr[i][1];		// 정렬을 통해 높아진 5개의 번호값을 배열에 넣어줌.
		}
		
		Arrays.sort(arr2);		// 번호를 순서대로 출력하기 위해 정렬을 해줌.

		System.out.println(sum);	// 점수 합계 출력문
		
		for(int i=0; i<5; i++) {
			System.out.print(arr2[i] + " ");	// 번호 출력문
		}

		sc.close();
	}
}