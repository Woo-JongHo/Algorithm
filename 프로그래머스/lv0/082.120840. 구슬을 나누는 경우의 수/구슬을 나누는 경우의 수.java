class Solution {
    public int solution(int balls, int share) {
       
        int answer = 0;
        // 분자, 분모
        double a = 1;
        double b = 1;
        double c = 1;
    
        // int에 담을 수 없는 부분을 어떻게 처리할 것인가.
        // 반환은 int 로 되어야함
        if ( balls == share){
            answer = 1;
           return (int) Math.round(answer);
        }   
        
        for (int i = 1 ; i <= balls ; i++)
            a = a * i;
        for (int i = 1 ; i <= balls-share ; i++)
            b = b * i;
        for (int i = 1; i <= share ; i++)
            c = c * i;
        
        answer = (int) Math.round(a / (b * c));
        // 형변환할 때 소수점을 처리하기 위함
        return answer;
        }
        

}
