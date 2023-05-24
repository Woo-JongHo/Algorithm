import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        //01 d를 오름차순으로 정리한다
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if(budget < d[i]){
                break;
            }   
            budget = budget - d[i];
            answer = answer + 1;
           
        }
        return answer;
    }
}