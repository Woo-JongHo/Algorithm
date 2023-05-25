class Solution {
    public int solution(long num) {
        int answer = 0;
        
        if ( num == 1)
            return 0;
        
        while( answer != 500){
            if( num % 2 == 0){
                num = num / 2;
                answer = answer + 1;
                if( num == 1)
                    break;
            } else{
                num = (3 * num) + 1;
                answer = answer + 1;
            }
        }
        if( answer == 500)
            return -1;
        
        return answer;
    }
}