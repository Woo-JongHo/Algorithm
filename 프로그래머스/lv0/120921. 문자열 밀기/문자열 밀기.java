class Solution {
    public int solution(String A, String B) {
        int answer = -1;

        int A_len = A.length();
        int B_len = B.length();
        char[] arr_A = A.toCharArray();
        char[] arr_B = B.toCharArray();

        // A를 밀어 B를 만들어야 한다.
        if (A_len == B_len) {
            for (int i = 0; i < A_len; i++) {
                boolean found = true;
                for (int j = 0; j < A_len; j++) {
                    if (arr_A[j] != arr_B[(i + j) % A_len]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}