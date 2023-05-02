class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]); // 가장 긴 변의 길이
        int min = Math.min(sides[0], sides[1]); // 나머지 한 변의 길이
        
        for (int i = min + 1; i < max; i++) {
            if (i < max - min) { // 가능한 삼각형의 경우인지 확인
                answer++;
            }
        }
        return answer;
    }
}
