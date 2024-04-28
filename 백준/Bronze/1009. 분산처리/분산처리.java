import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int result = (int) Math.pow(a % 10, b % 4 + 4);
            System.out.println(result % 10 == 0 ? 10 : result % 10);
        }
        
        scanner.close();
    }
}
