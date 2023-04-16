class Solution {
    public int[] solution(int n) {
        
        //2. 약수 개수를 찾는 함수
        int count = 0;
        for (int i =1 ; i <= n ; i++){
            if(n % i == 0){
                count = count + 1;
            }
        }
        
        //1. 배열의 크기를 설정해야하는데, 크기는 약수개수여야한다.
        int[] answer = new int[count];
        int j = 0;
        for(int i = 1 ; i <= n ; i++){
            if( n % i == 0){
                //3. 배열의 번째와 추가되는 i가 다를 수 있어 j++를 넣어준다
                answer[j++] = i;   
                }
            }           
        return answer;
    }
}
