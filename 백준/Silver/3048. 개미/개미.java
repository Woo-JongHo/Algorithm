import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //개미그룹의 수 n1, n2 입력
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int t;
        int i = 0, j = 0;

        //개미 입력
        String[] ant = new String[2];
        while(i < 2) {
            ant[i] = br.readLine();
            i++;
        }
        t = Integer.parseInt(br.readLine());

        //t가 n1 + n2 - 1 이상인 경우 개미의 순서는 똑같기 때문에 t = n1 + n2 - 1
        if (t > n1 + n2) {
            t = n1 + n2 - 1;
        }

        //첫번째 개미 그룹(ant[0]) 문자열을 reverse
        StringBuilder sb0 = new StringBuilder(ant[0]);

        //전체 개미 위치를 나타낼 문자배열과 방향을 나타내줄 상태배열
        ant[0] = sb0.reverse().append(ant[1]).toString();
        char[] ants = ant[0].toCharArray();
        boolean[] check = new boolean[n1 + n2];

        //개미 그룹1이면 true, 개미 그룹2이면 false
        for (i = 0; i < n1; i++)
            check[i] = true;
        for (; i < n1+ n2; i++)
            check[i] = false;


        while(t-- > 0) {
            for (i = 0; i < n1 + n2 - 1; i++ ) {
                if (check[i] && !check[i+1]) {
                    //개미의 위치 swap
                    char tmp = ants[i];
                    ants[i] = ants[i+1];
                    ants[i+1] = tmp;
                    //방향도 swap
                    boolean tmp2 = check[i];
                    check[i] = check[i+1];
                    check[i+1] = tmp2;

                    i++;
                }
            }
        }

        for (char ch: ants)
            System.out.print(ch);
    }
}