import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int startIndex = commands[i][0] - 1; 
            int endIndex = commands[i][1]; 
            int[] subarr = Arrays.copyOfRange(array, startIndex, endIndex);
            
            // 배열 정렬
            Arrays.sort(subarr);
            
            // K번째 수 구하기
            int k = commands[i][2] - 1;
            answer[i] = subarr[k];
        }        
        
        return answer;
    }
}