class Solution { 
    public String[] solution(String my_str, int n) {
      //01  answer의 넣을 배열길이설정
        int len = my_str.length() / n;
        
        //02 배열길이가 안나누어 떨어지면 + 1로 설정
        if (my_str.length() % n != 0) {
            len++;
        }
        String[] answer = new String[len];
        int j = 0;
        
        //02, 배열 설정값에 따라 케이스를 나눠준다.
        for (int i = 0; i < len; i++) {
            if (j + n > my_str.length()) {
                answer[i] = my_str.substring(j);
            } else {
                answer[i] = my_str.substring(j, j + n);
            }
            j = j + n;
        }
        return answer;
    }
}
//length 