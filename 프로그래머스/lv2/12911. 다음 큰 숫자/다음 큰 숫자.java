class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        // 01 2진법으로 변환 함수
        String a = Integer.toBinaryString(n);

        // 문자열에서 특정 숫자 세기
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')
                count = count + 1;
        }
        int k = count;
        int j = 0;

        count = 0;
        while (count != k) {
            j = j + 1;
            String b = Integer.toBinaryString(n + j);
            count = 0; // count를 0으로 초기화
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == '1')
                    count = count + 1;
            }
        }
        answer = n + j;
        return answer;
    }
}