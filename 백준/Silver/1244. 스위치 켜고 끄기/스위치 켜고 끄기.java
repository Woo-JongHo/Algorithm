import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int switchCount = Integer.parseInt(reader.readLine());
        String[] states = reader.readLine().split(" ");
        int studentCount = Integer.parseInt(reader.readLine());

        int[] switches = new int[switchCount];
        for (int i = 0; i < switchCount; i++) {
            switches[i] = Integer.parseInt(states[i]);
        }

        for (int i = 0; i < studentCount; i++) {
            String[] input = reader.readLine().split(" ");
            int gender = Integer.parseInt(input[0]);
            int number = Integer.parseInt(input[1]);

            if (gender == 1) {
                for (int j = number; j <= switchCount; j += number) {
                    switches[j - 1] ^= 1; // XOR로 상태 변경
                }
            } else if (gender == 2) {
                int left = number - 1;
                int right = number - 1;

                while (left > 0 && right < switchCount - 1 && switches[left - 1] == switches[right + 1]) {
                    left--;
                    right++;
                }

                for (int j = left; j <= right; j++) {
                    switches[j] ^= 1; // XOR로 상태 변경
                }
            }
        }

        for (int i = 0; i < switchCount; i++) {
            System.out.print(switches[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
