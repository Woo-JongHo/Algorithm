class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int a = 0;
        int b = x;
        
        // 제한조건이 10000이므로 4번만 돌림
        for ( int i = 1 ; i < 5 ; i++){
            a = a + (b % 10);
            b = b / 10;
            if( b == 0)
                break;
        }
        
        if( x % a == 0)
            answer = true;
        else
            answer = false;
        
        
        return answer;
       
    }
}