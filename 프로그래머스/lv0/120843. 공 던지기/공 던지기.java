class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        int mod = 0;
        
        //01 numbers가 짝수이면
        if (len % 2 == 0) {
            //k는 len / 2 만큼 나눈 나머지만큼 돈다
            if ( k <= len / 2 + 1) // k가 돌지 않는다면
                answer = numbers[0 + 2 * k];
            else
                mod= (len % k) - 1;
                answer = numbers[0 + 2 * mod];
        }  else { // numbers가 홀수이면

        }
        return answer;

    }
        
}
