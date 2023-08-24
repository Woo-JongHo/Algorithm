class Solution {
    boolean solution(String s) {
        boolean answer = true;

        //01 개수와 순서가 맞아야한다

        int count_a = 0;
        int count_b = 0;

        char [] arr = s.toCharArray();

        for (int i = 0 ; i < arr.length; i ++){
            if(arr[i] == '(')
                count_a = count_a + 1;
            else
                count_b = count_b + 1;

            if(count_b > count_a)
                answer = false;
        }

        if (count_a != count_b){
            answer = false;
        }

        return answer;
    }
}