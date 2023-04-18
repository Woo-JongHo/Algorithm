public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 01. int를 String으로 바꿔 길이를 측정
        String str = String.valueOf(n); // "123"
       
        // 02. 가장 큰 자리수 부터 추줄, 10의 N승은 Math.pow(10,n) 이용
        for (int i = str.length() - 1; i >= 0 ; i--){
            answer = answer +  (n / (int)Math.pow(10, i));
            n = n % (int)Math.pow(10, i);
        }
        
        return answer;
    }
}
