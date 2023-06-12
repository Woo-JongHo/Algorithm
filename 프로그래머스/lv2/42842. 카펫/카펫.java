class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        //01 제곱수면 그냥 바로 리턴 할 수 있는거고...
        //02 BRWON+YELLOW 를 나눠야하는건데..
        //03 완전탐색이 힌트같으나 전혀 모르겠다...
        //04 아 일단 brown yellow를 더해서 곱하는 경우의수를 모두 넣고 거기서 맞는걸 뽑아쓰자
        
        int sum = brown + yellow;
        
        for(int i = 2 ; i < sum ; i++ ){
            if ( sum == i * i){
                answer[0] = i;
                answer[1] = i;            
            }
        }
        
        //05 테두리를 세주면된다
        int count = 0;
        for(int i = 1 ; i <= sum ; i ++){
            if( sum % i == 0)
                count = count + 1;
        }
        //06  경우의수
        int [][] arr = new int [count][2];
        int a = 0;
        for(int i = 1; i <= sum ; i++){
            if( sum % i == 0 ){
                arr[a][0] = sum / i;
                arr[a][1] = i;
                a = a + 1;
            }
        }
        
        int b = 0;
        for ( int i = 0 ; i < arr.length; i++){
            b = (arr[i][0] * 2) + (arr[i][1] * 2) - 4;
            if ( brown == b && arr[i][0] >= arr[i][1] && arr[i][1] > 2){
                answer[0] = arr[i][0];
                answer[1] = arr[i][1];
                break;
            } else{
                b = 0;
            }           
        }
        return answer;
    }
}