class Solution {
    public String solution(String s) {
        String answer = "";
        
        char [] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'A' && arr[i] <= 'Z')
                arr[i] = (char)(arr[i] + 32);
        }
        
        if(arr[0] >= 'a' && arr[0] <= 'z' )
            arr[0] = (char)(arr[0] - 32);
        
        
        for(int i = 1 ; i < arr.length - 1 ; i++){
            if(arr[i] == ' ' && arr[i+1] >= 'a' && arr[i] == ' ' && arr[i+1] <= 'z')
                arr[i+1] = (char)(arr[i+1] - 32);
        }
        
              
        return answer = String.valueOf(arr);
    }
}