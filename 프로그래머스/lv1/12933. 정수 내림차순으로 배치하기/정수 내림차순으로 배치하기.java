import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        char[] b = a.toCharArray();
        Arrays.sort(b); // 오름차순으로 정렬
        
        // 문자 배열을 내림차순으로 변환
        int i = 0;
        int j = b.length - 1;
        while (i < j) {
            char temp = b[i];
            b[i] = b[j];
            b[j] = temp;
            i++;
            j--;
        }
        
        String c = new String(b);
        answer = Long.parseLong(c);
        
        return answer;
    }
}