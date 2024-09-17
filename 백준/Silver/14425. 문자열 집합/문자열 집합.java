import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();  

        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            stringSet.add(str);
        }
        int count = 0;
        for (int i = 0; i < M; i++) {
            String checkStr = sc.nextLine();
            if (stringSet.contains(checkStr)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
