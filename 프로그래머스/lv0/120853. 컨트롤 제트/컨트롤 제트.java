class Solution {
    public int solution(String s) {
        int answer = 0;
    String [] a = s.split(" ");

	for(int i = 0 ; i < a.length ; i++) {
	    int j = i - 1;
        if("Z".equals(a[i])) {
            answer = answer - Integer.parseInt(a[j]);
    
        }
		else {
			answer = answer + Integer.parseInt(a[i]);
		}
	}
        return answer;
    }
}