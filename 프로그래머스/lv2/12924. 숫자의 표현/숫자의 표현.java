class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        boolean b = true;
        while(b == true){
            int j = 0;
            for(int i = j + 1 ; i <= n ; i++){
                count = count + i;
                if(count == n){
                    answer = answer + 1;
                    j = j + 1;
                    count = 0;
                    i = j;
                    if( n == i)
                        b = false;
                } else if ( count > n){
                    j = j + 1;
                    count = 0;
                    i = j;
                }
            }
        }
        return answer;
    }
}