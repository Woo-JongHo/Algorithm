import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long i = 1, s = 1;
        int ex, ey, x = 0, y = 0;
        ex = scanner.nextInt();
        ey = scanner.nextInt();

        while (x != ex + ey) {
            s += i * 6;
            x++;
            i++;
        }
        if (ex == x && ey == y) {
            System.out.println(s);
            return;
        }
        while (ex != x && ey != y) {
            s++;
            x--;
            y++;
        }
        System.out.println(s - (i - 1) * 6);
    }
}
