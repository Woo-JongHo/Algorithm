class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int p_len = p.length();
        int t_len = t.length();
        long p_num = Long.parseLong(p);
        
        for (int i = 0; i <= t_len - p_len; i++) {
            String s = t.substring(i, p_len + i);
            long k = Long.parseLong(s);
            if (k <= p_num) {
                answer = answer + 1;
            }
        }
        
        return answer;
    }
}