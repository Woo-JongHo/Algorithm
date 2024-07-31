class Solution {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)) {  // str1 안에 str2가 있는 경우
            return 1;
        } else {                    // str1 안에 str2가 없는 경우
            return 2;
        }
    }
}