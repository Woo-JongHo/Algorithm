import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        
        //01 long을 str열
        String str = String.valueOf(n);
        
        //02 char배열로 선언
        char [] char_arr = str.toCharArray();
        
        //03 차배열을 String 배열로
        String [] str_arr = new String[char_arr.length];

        int j = 0;
        for(int i = char_arr.length - 1 ; i >= 0 ; i--){
            str_arr[j] = String.valueOf(char_arr[i]);             
            j++;
        }        

        //04 answer에 담기
        int [] answer = new int[str_arr.length];
        for(int i = 0; i < str_arr.length; i++){
            answer[i] = Integer.parseInt(str_arr[i]);
        }
        
        return answer;
    }
}