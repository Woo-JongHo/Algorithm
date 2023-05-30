import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // char 배열로 변환
        char[] arr = s.toCharArray();
        
        // 내림차순으로 정렬
        Arrays.sort(arr);
        
        // 배열을 역순으로 변환
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
        // 정렬된 배열을 문자열로 변환
        answer = new String(arr);
        
        return answer;
    }
}