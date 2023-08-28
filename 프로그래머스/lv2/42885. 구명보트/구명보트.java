import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int index = 0;
        
        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index = index + 1;
                answer = answer + 1;
            }
            else {
                answer = answer + 1 ;
            }
        }
        
        return answer;
    }
}