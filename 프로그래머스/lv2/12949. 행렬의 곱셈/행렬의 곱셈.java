class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        //01 answer의 크기 설정
        int a = arr1.length; // arr1의 행 개수
        int b = arr2[0].length; // arr2의 열 개수
        
        int[][] answer = new int[a][b];
        
        //02 행렬의 곱셈을 계산
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                int sum = 0;
                for(int k = 0; k < arr1[0].length; k++){
                    // 곱셈과 덧셈을 수행하여 결과 행렬의 값을 계산합니다.
                    sum = sum + arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum; // 결과를 결과 행렬에 저장합니다.
            }
        }
        
        return answer;
    }
}