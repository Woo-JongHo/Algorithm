class Solution {
    public int solution(int n) {
		int answer = 0;
		// 정수형에선 특정 숫자를 뽑아낼 수 없다.(변환해야함)

        //00 문제 접근을 굉장히 잘못함... HashSet이용해서 지우려고 했음.
        //01 숫자를 세는 사람이 3의배수와 3을 안쓰는 것이였음
        
        //01 3을 마주치거나 3을 포함하는 문자열을 만나면 더하기
        for(int i = 1 ; i <= n ;i++){
            answer = answer + 1;
            while( answer % 3 == 0 || Integer.toString(answer).contains("3"))
                   answer = answer + 1;
            }
        return answer;
  
    }
}
		        


