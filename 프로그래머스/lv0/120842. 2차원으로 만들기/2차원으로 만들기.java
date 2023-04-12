class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        //01. 1차,2차배열의 크기를 정해준다
        int len = num_list.length / n;

        int[][] answer = new int[len][n];
        int [] arr = new int[n];
        
        //02. 1차배열은 len만큼돌고, 2차배열은 n만큼 돈다.
        //03. num_list까지 돌기위해 k를 사용한다. 
        int k = 0;
        for(int i = 0; i < len;i++){
            for(int j = 0 ; j < n ; j++){
                answer[i][j] = num_list[k];
                k++;
            }
        }
        return answer;
    }
}
