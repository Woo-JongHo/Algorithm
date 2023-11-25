import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, e, f, g;
        int sum = 0;
        int minOdd = 100; // 주어진 자연수의 최댓값으로 초기화

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        g = sc.nextInt();

        // 홀수를 찾아 합과 최솟값 계산
        if (a % 2 != 0) {
            sum += a;
            if (minOdd > a)
                minOdd = a;
        }
        if (b % 2 != 0) {
            sum += b;
            if (minOdd > b)
                minOdd = b;
        }
        if (c % 2 != 0) {
            sum += c;
            if (minOdd > c)
                minOdd = c;
        }
        if (d % 2 != 0) {
            sum += d;
            if (minOdd > d)
                minOdd = d;
        }
        if (e % 2 != 0) {
            sum += e;
            if (minOdd > e)
                minOdd = e;
        }
        if (f % 2 != 0) {
            sum += f;
            if (minOdd > f)
                minOdd = f;
        }
        if (g % 2 != 0) {
            sum += g;
            if (minOdd > g)
                minOdd = g;
        }

        // 홀수가 존재하지 않을 경우 -1 출력, 그렇지 않으면 합과 최솟값 출력
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minOdd);
        }
    }
}