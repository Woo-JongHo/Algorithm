import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = A * B * C;
        String resultStr = Integer.toString(result);

        int[] counts = new int[10];

        for (int i = 0; i < resultStr.length(); i++) {
            counts[resultStr.charAt(i) - '0']++;
        }

        for (int count : counts) {
            System.out.println(count);
        }

        sc.close();
    }
}
