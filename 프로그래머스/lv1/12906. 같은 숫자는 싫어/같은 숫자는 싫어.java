import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        //01 answer의 크기를 먼저 정해준다
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                count = count + 1;
            }
        }
        
        int [] answer = new int[arr.length - count];        

        
        int j = 0;
        answer[0] = arr[0];
        //02 값을 비교해서 같지 않으면 뒤에 있는 애를 배열에 담는다
        for (int i = 0 ; i < arr.length - 1; i++){
            if( arr[i] != arr[i+1]){
                answer[j+1] = arr[i+1];
                j++;
            }
        }
        
        return answer;
    }
}