import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int[] arr = new int[map.size()];
        int index = 0;
        for (int num : map.values()) {
            arr[index] = num;
            index++;
        }
        
        Arrays.sort(arr);
        
        int total = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (k > 0) {
                k = k -arr[i];
                total = total + 1;
            } else {
                break;
            }
        }
        
        answer = total;
        return answer;
    }
}