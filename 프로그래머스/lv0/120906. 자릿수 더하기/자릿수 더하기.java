class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String a = String.valueOf(n);
        char [] b = a.toCharArray();
        
        for (int i = 0 ; i < b.length ; i++){
            answer = answer + b[i] - 48;
        }
        return answer;
    }   
}