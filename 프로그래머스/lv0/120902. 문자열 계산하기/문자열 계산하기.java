class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String [] arr = my_string.split(" ");
        //"3" "+" "4" "15" "-" "13"
        //이와같이 출력되었을때 어떻게하면 좋을까
        answer = Integer.valueOf(arr[0]);
        
        for(int i = 1; i < arr.length ; i++){
            if(arr[i].equals("+"))
                answer = answer + Integer.valueOf(arr[i+1]);
            else if(arr[i].equals("-"))
                answer = answer - Integer.valueOf(arr[i+1]);
        }
            
        return answer;
    }
}