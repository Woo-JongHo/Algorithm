class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        
        int min = 0;
        int zero = 0;
        for(int i = 0 ; i < 6; i++){
            if(lottos[i] == 0)
                     zero = zero + 1;
            for(int j = 0 ; j < 6 ; j++){
                if(lottos[i] == win_nums[j]){
                    min = min + 1;
                }
            }
        }
         
        answer[0] = 7 - (min + zero);
        answer[1] = 7 - min;
        
        if(min == 0)
            answer[1] = 6;
        if(min == 0 && zero == 0)
            answer[0] = 6;
        
        return answer;
 
    }
}