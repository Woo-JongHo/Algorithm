class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        
        //01 일단그냥 두 수 곱해서 기약분수까지 내리자
        numer1 = numer1 * denom2; 
        numer2 = numer2 * denom1;
        
        denom1 = denom1 * denom2;
        denom2 = denom2 * denom1;
        
        int a = numer1 + numer2;
        int b = denom1;
        
        if( a > b ){
            for( int i = 2; i <= b ; i++){
                if(a % i == 0 && b % i == 0){
                    a = a / i;
                    b = b / i;
                    i = 1;
                }
            }
        } else{
            for (int i = 2; i <= a ; i++){
                if(a % i == 0 && b % i ==0){
                    a = a / i;
                    b = b / i;
                    i = 1;
                }
            }
        }
        
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}