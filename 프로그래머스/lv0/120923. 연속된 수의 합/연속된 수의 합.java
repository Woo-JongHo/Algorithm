class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];        
        int a = 0;
        
        //01 중간값을 알기 때문에, 거기서 첫 배열을 찾아서 1씩 더함
        if ( total % num == 0){
            a = total / num;
            // 얘가 중간임
            for (int i = 0; i < num ; i++){
                answer[i] = a - ((num -1) / 2);
                a = a + 1; // 이 로직이 생각이 안났음.
            }
        }
        else{
            a = total / (num / 2); // a = 7 a = 3
            a = a / 2;
            
            for(int i = 0 ; i < num ; i++){
                answer[i] = a - (num / 2) + 1;
                a = a + 1;
            }
        }

        return answer;

        }
}
