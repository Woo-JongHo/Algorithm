class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = "";
        
        while(n != 0){
            three = three + (n % 3);
            n = n / 3; 
        }
        
        //두번째 인자의 진법을 10진법으로
        answer = Integer.parseInt(three,3);        
        
        return answer;
    }
}