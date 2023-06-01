class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        //01 두 배열중에 큰 수를 한쪽으로 몬다
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        int compare_x = 0;
        int compare_y = 0;
        for(int i = 0 ; i < sizes.length; i++){
            if( compare_x  < sizes[i][0])
                compare_x = sizes[i][0];
            if ( compare_y < sizes[i][1])
                compare_y = sizes[i][1];
        }
        
        answer = compare_x * compare_y;
            
        return answer;
    }
}