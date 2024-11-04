import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bufferReader.readLine());
        
        List<List<Integer>> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bufferReader.readLine());

        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(st.nextToken());
            List<Integer> pair = new ArrayList<>();
            pair.add(input);  // 값
            pair.add(i);      // 인덱스
            list.add(pair);
        }

        Collections.sort(list, (a, b) -> Integer.compare(a.get(0), b.get(0)));

        int[] resultArr = new int[num];
        for (int i = 0; i < num; i++) {
            resultArr[list.get(i).get(1)] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int val : resultArr) {
            sb.append(val).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
