import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long k = scan.nextLong();
        long curNum = 1;
        long result = 0;
        ArrayList<Long> arr = new ArrayList<>();
        
        while ((long) Math.pow(2, arr.size()) <= k) {
            if ((x | curNum) != x) {
                arr.add(curNum);
            }
            curNum *= 2;
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (k == 0) {
                break;
            } else {
                if (k >= (long) Math.pow(2, i)) {
                    result += arr.get(i);
                    k -= (long) Math.pow(2, i);
                }
            }
        }
        
        System.out.println(result);
    }
}
