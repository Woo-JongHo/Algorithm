class Solution {
    public int solution(int balls, int share) {
       
        double answer = 0;
        // 분자, 분모
        double a = 1;
        double b = 1;
        double c = 1;
    
     
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
        
        answer = (a / (b * c));
        return (int) Math.round(answer);
        }
        

}