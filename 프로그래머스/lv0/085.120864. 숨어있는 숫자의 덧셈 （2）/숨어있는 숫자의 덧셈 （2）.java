class Solution {
    public int solution(String my_string) {
            int answer = 0;
        String s1 = "";
        String[] arr = my_string.split("[^0-9]+"); // 숫자가 아닌 문자열로 분리
        for (int i = 0; i < arr.length; i++) {
            s1 = s1 + arr[i];
        }
        for (int i = 0; i < arr.length; i++) 
            if (!arr[i].trim().isEmpty()) 
                answer = answer + Integer.parseInt(arr[i]);
                
        return answer;
        }
    }
