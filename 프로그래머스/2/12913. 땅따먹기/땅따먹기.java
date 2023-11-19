class Solution {
    int solution(int[][] land) {
		int answer = 0;
		int[][] dp = new int[land.length][4];

		// 맨 첫 행 세팅
		for(int i = 0; i < 4; i++) {
			dp[0][i] = land[0][i];
		}
		
		for (int i = 1; i < land.length; i++) {
			for (int j = 0; j < 4; j++) {
            	// 이전 행에서 가장 큰 값 찾기
				int max = 0;
				for(int k = 0; k < 4; k++) {
					if(j != k) // 같은 열은 제외 
                    	max = Math.max(max, dp[i - 1][k]);
				}
				
                // 가장 큰 값에 현재 땅 값 더해주기
				dp[i][j] = max + land[i][j]; 
			}
		}

		// 마지막 행에서 가장 큰 값이 답이 된다.
		for(int i : dp[land.length - 1]) {
			answer = Math.max(answer, i);
		}
				
		return answer;
	}
}