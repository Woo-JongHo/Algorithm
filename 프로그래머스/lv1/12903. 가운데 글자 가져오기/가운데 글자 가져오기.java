class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()]; // 배열 크기를 문자열의 길이로 초기화
        
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);    
        }
        
        if (s.length() % 2 != 0)
            answer = arr[s.length() / 2] + "";
        else
            answer = arr[s.length() / 2 - 1] + "" + arr[s.length() / 2] + "";
        
        return answer;
    }
}