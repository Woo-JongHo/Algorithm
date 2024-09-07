import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int brokenCount = sc.nextInt();
        
        boolean[] brokenButtons = new boolean[10];
        if (brokenCount > 0) {
            for (int i = 0; i < brokenCount; i++) {
                int broken = sc.nextInt();
                brokenButtons[broken] = true;
            }
        }
        
        int minPress = Math.abs(target - 100);
        
        for (int i = 0; i <= 1000000; i++) {
            int length = possible(i, brokenButtons);
            if (length > 0) {
                int press = length + Math.abs(target - i);
                if (press < minPress) {
                    minPress = press;
                }
            }
        }
        
        System.out.println(minPress);
    }

    private static int possible(int channel, boolean[] brokenButtons) {
        String strChannel = String.valueOf(channel);
        for (int i = 0; i < strChannel.length(); i++) {
            if (brokenButtons[strChannel.charAt(i) - '0']) {
                return 0;
            }
        }
        return strChannel.length();
    }
}
