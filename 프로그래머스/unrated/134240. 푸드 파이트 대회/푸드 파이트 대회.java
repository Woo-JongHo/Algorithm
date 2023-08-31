class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        
        int count = 0;
        //배열의 양을 구하고
        
        // 배열을 구한다음에 중간에 넣고 거꾸로 반복?
        
        //01 배열의 양
        for(int i = 1 ; i < food.length; i++){
            
            count = food[i] / 2;
            System.out.println(count);
            if( count != 0){
                for(int j = 1 ; j <= count; j++){
                    answer = answer + String.valueOf(i);
                }
            }
        }
        
        answer = answer + "0";
        
        for(int i = food.length - 1 ; i >= 1 ; i--){
            count = food[i] / 2;
            if( count != 0){
                for (int j = 1 ; j <= count; j++){
                    answer = answer + String.valueOf(i);
                }
            }
        }
        
        return answer;
    }
}