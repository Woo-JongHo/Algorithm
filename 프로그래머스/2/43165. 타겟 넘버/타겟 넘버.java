class Solution {
	// 1. 답 변수 answer static으로 선언.
    static int answer = 0;
    public int solution(int[] numbers, int target) {
    	// 2. dfs 함수 실행.
        dfs(numbers,target,0,0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int sum){
    	// 3. 배열 마지막 노드까지 탐색이 끝났는지 체크
        if(idx == numbers.length){
        	// 4. 합계와 타겟 값이 같으면 answer을 1 증가 시킴.
            if(sum == target) answer++; 
        }else{
            dfs(numbers, target, idx+1, sum+numbers[idx]);
            dfs(numbers, target, idx+1, sum-numbers[idx]);
        }   
    }
}