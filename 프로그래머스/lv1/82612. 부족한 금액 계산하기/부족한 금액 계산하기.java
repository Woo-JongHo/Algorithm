class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        
        for(int i = 1 ; i <= count ; i++)
            money = money - price * i;
        
        
        if( money >= 0)
            return answer = 0;
        else 
            return answer = Math.abs(money);
        

    }
}