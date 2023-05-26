class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count_p = 0;
        int count_y = 0;
        char [] arr = s.toCharArray();
        
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 'p' || arr[i] == 'P')
                count_p = count_p + 1;
            if(arr[i] == 'y' || arr[i] == 'Y')
                count_y = count_y + 1;
        }
        
        if(count_p == count_y)
            answer = true;
        else
            answer = false;

        return answer;
    }
}