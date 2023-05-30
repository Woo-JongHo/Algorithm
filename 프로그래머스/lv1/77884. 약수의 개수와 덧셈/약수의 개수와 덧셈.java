class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int [] arr = new int [right - left  + 1];
        
        //01 24,25,26,27 을 가져온다
        for(int i = left, j = 0 ; i <= right ; i++){
            arr[j] = i;
            j++;
        }
        //02 for문을 돌면서 각 수의 약수의 갯수를 구한다
        for(int i = 0;  i < arr.length; i++){
            for(int j = 1; j <= arr[i] ; j++){
                if( arr[i] == j * j){
                    arr[i] = -1 * arr[i];
                    break;
                }
            }
        }

        //03 약수의 갯수가 홀수라면빼고 짝수면 더하는 로직을 구한다
        for(int i = 0 ; i < arr.length;i++){
            answer= answer + arr[i];
        }
        return answer;
    }
}