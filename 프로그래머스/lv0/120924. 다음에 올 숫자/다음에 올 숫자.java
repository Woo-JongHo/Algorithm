class Solution {
    public int solution(int[] common) {
        int answer = 0;      
        int a = 0;
        int b = 1;
    
        // 등차인지 등비인지 판별부터
        if (common[0] == 0) {
            a = common[1] - common[0];
            answer = common[common.length - 1] + a;
        } else {
            a = common[1] - common[0];
            b = common[1] / common[0];
            if ((common[2] == common[1] * b) && (common[1] == common[0] * b)) {
                answer = common[common.length - 1] * b;
            } else {
                answer = common[common.length - 1] + a;
            }  
        }
        return answer;
    }
}