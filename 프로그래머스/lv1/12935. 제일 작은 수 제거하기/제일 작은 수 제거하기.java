import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int [] check = new int[arr.length];
        int a = 0;
        int index = -1;
        
        //01 빈배열이면 return -1 처리
        if ( arr.length == 1){
          return new int[] {-1};
        }
        else{
            int [] answer = new int [arr.length - 1];

            //02 check 함수를 통해 가장 작은 숫자를 알아낸다
            for(int i = 0 ; i < arr.length; i++)
                check[i] = arr[i];

            Arrays.sort(check);
            a = check[0]; //가장 작은수를 찾음

            //03 answer에다가 넣으면서 가장작은수를 만나면 삭제한다
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] == a)
                    index = i;
            }

            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] != arr[index]) {
                    answer[j] = arr[i];
                    j++;
                }
            }
        return answer;
        }
    }
        
}