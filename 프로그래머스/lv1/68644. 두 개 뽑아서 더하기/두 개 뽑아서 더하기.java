import java.util.LinkedHashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        
        //01 중복 및 순서
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        
        // 두 수의 합을 Set에 저장
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                lhs.add(numbers[i] + numbers[j]);
            }
        }
        
        // Set의 크기에 맞는 int 배열 생성
        int[] answer = new int[lhs.size()];
        
        // Set의 요소를 int 배열에 복사
        int i = 0;
        for (int num : lhs) {
            answer[i++] = num;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
