import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();

        Arrays.sort(arr); // 배열 정렬

        int count = 0;

        for (int i = 0, j = a - 1; i < j;) {
            int sum = arr[i] + arr[j];

            if (sum == b) {
                count++;
                i++;
                j--;
            } else if (sum < b) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(count);
    }
}