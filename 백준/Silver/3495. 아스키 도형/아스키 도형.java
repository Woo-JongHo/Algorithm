import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        double cnt = 0;
        for(int i = 0; i < h; i++) {
            String s = sc.next();
            int chk = 0;
            for (int j = 0; j < w; j++) {
                char c = s.charAt(j);
                if (c == '/' || c == '\\') {
                    cnt += 0.5;
                    chk++;
                }
                if (chk % 2 == 1 && c == '.')
                    cnt++;
            }
        }
        System.out.println((int)cnt);
    }
}