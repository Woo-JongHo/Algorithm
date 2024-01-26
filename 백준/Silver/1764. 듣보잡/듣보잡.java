import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 듣도 못한 사람의 수
        int m = scanner.nextInt(); // 보도 못한 사람의 수

        HashSet<String> unheardSet = new HashSet<>();
        HashSet<String> unseenSet = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        // 듣도 못한 사람의 명단 입력
        for (int i = 0; i < n; i++) {
            unheardSet.add(scanner.next());
        }

        // 보도 못한 사람의 명단 입력
        for (int i = 0; i < m; i++) {
            unseenSet.add(scanner.next());
        }

        // 듣도 못한 사람 중 보도 못한 사람과 겹치는 경우 찾기
        for (String name : unheardSet) {
            if (unseenSet.contains(name)) {
                result.add(name);
            }
        }

        // 듣보잡의 수와 명단 출력
        Collections.sort(result); // 사전순 정렬
        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
