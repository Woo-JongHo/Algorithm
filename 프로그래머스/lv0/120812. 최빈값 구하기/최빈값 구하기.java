class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int count_max = 0;
        
        //01 두 값을 비교하는 챌린지 형식으로 간다
        for(int i = 0 ; i < array.length ; i++){
            int count = 0;

            for(int j = 0; j < array.length; j++){
                if(array[j] == array[i]){
                    count = count + 1;
                } 
            }
            
            if( count > count_max){
                answer = array[i];
                count_max = count;
            } else if ( count == count_max && array[i] != answer){
                answer = -1;
            } 
            
        }
        return answer;
    }
}