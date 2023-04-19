import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String s) {
        String answer = "";

        //01 문자열을 검색을 위해 문자 배열로 변환
        char[] chars = s.toCharArray();

        HashMap<Character, Integer> count = new HashMap<>();

        //02 각 문자 등장 횟수를 저장합니다.
        for (char c : chars) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }

        //03 등장 횟수 1회만 출력
        for (char c : chars) {
            if (count.get(c) == 1) {
                answer = answer + c;
            }
        }
        //04 오름차순으로 나타내기위해 배열로 전환
        char[] c_answer = answer.toCharArray();
        Arrays.sort(c_answer);
        answer = new String(c_answer);
       
        return answer;
    }
}