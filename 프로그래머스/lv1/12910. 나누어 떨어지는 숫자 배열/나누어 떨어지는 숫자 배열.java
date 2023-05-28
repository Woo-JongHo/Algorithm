import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0)
                count = count + 1;
        }
        
        if (count == 0){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        else {
            int[] answer = new int[count];
            
            int j = 0;
        
            for(int i = 0; i < arr.length; i++){
                if(arr[i] % divisor == 0){
                    answer[j] = arr[i];
                    j++;                    
                }
            }
            
            Arrays.sort(answer);
            return answer;
        }
    }
}