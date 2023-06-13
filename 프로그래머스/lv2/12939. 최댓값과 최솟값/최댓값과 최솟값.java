import java.util.Arrays;
class Solution {
    public String solution(String s) {
          
        String [] arr = s.split(" ");
        int [] num = new int[arr.length];      
        for(int i = 0 ; i < arr.length ; i++)
            num[i] = Integer.parseInt(arr[i]);
        
        Arrays.sort(num);
        
        
        String answer = num[0]  +" "+ num[arr.length - 1];
        return answer;
    }
}