import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        //01. before와 after을 오름차열 배순으로 정하고 같으면 된다.
        char [] bf = before.toCharArray();
        char [] af = after.toCharArray();
        
        Arrays.sort(bf);
        Arrays.sort(af);
        
        if (Arrays.equals(bf, af)) { // 배열비교는 이렇게
            answer = 1;
        } else{
            answer = 0;
        }
        
        
        return answer;
    }
}
