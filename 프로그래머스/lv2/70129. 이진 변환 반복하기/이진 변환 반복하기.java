class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int sum = 0;
        int count = 0;
        int result = 0;
        
        char [] arr = s.toCharArray();

        while(arr.length != 1){
            int j = 0;
            for(int i = 0 ; i < arr.length; i++){
                //01 answer[1] 의 개수를 센다
                if(arr[i] == '0'){
                    count = count + 1;
                    sum = sum + 1;
                }
            }
            String bi = Integer.toBinaryString(arr.length - count);
            count = 0;
            result = result + 1;
            arr = bi.toCharArray();
        }
        answer[0] = result;
        answer[1] = sum;
        return answer;
    }
}