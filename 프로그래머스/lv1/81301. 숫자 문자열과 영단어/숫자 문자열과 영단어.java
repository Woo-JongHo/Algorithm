class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String [] arr_s = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String [] arr_n = {"0","1","2","3","4","5","6","7","8","9"};
        
        for(int i = 0 ; i < 10 ; i++){
            if(s.contains(arr_s[i])){
               s = s.replaceAll(arr_s[i],arr_n[i]);
            }
        }

        answer  = Integer.parseInt(s);        
        return answer;
    }
}