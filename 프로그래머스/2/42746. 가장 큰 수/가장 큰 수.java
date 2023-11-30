import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        // String 배열로
        String[] strNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        // 내림차순 정렬
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        // 배열에 0밖에 없을 경우 0만 보냄
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // 정렬된 숫자 붙이기
        for (String s : strNumbers) {
            answer += s;
        }

        return answer;
    }
}