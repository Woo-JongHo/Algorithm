import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isHanNumber(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean isHanNumber(int num) {
        if (num < 100) {
            return true;
        }
        int[] digits = getDigits(num);
        int diff = digits[1] - digits[0];
        for (int i = 1; i < digits.length - 1; i++) {
            if (digits[i + 1] - digits[i] != diff) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] getDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
}
