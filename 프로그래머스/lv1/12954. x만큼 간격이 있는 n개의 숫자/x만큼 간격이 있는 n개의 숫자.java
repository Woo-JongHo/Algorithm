class Solution {
    public long[] solution(int x, int n) {
        
        //01 answer의 길이는 n과 같다.
        long [] answer = new long [n];
        
        //02 n은 자연수이기 때문에 0부터 하지않는다.
        //03 케이스 오류가 나는데.. 범위에 관해 고려해준다
        answer[0] = x;
        for(int i = 1; i < n ; i++ ){
            answer[i] = x + (long)x * i;
        }
        return answer;
    }
}