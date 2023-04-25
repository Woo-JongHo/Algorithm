class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        //01 board의 끝에 도달하면 없는 값이 되므로
        //board끝이 아닐 때를 고려한다.
        for(int i =0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(answer[0] != board[0] / 2 * (-1))
                    answer[0] = answer[0] -1;
            }
            else if (keyinput[i].equals("right")){
                if(answer[0] != board[0] / 2)
                    answer[0] = answer[0] + 1;
            }
            else if (keyinput[i].equals("down")){
                if(answer[1] != board[1] / 2 * (-1))
                    answer[1] = answer[1] - 1;
            }
            else if(keyinput[i].equals("up")){
                if(answer[1] != board[1] / 2 )
                    answer[1] = answer[1] + 1;
            }
        }
        return answer;
    }
}
