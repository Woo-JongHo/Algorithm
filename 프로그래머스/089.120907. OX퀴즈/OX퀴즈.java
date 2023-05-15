class Solution {
    public String[] solution(String[] quiz) {
        String[] answer =new String[quiz.length];
        
        
        // for문을 돌면서 split을 나눈다
        for(int i = 0 ; i < quiz.length ; i ++){
            String[] arr = quiz[i].split(" ");   // 이거 하기 어려웠음. 사이즈를 무조건 정해줘야하는줄 
        
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int num3 = Integer.parseInt(arr[4]); // 정답
            
            if(arr[1].equals("+")){
                if((num1 + num2) == num3)
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
            else {
                if((num1 - num2) == num3)
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
        }
                
        return answer;
    }
}
