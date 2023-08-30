class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String [] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        

        int startDay = 5;
        
        int [] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 입력받은 월(a) 이전 달들의 일 수를 더함
        for (int i = 1; i < a ; i++) {
            startDay = startDay +  monthDays[i - 1];
        }
        
        // 입력받은 일(b)을 더하여 요일을 계산
        startDay = (startDay + b - 1) % 7;
        
        answer = day[startDay];
        
        return answer;
    }
}