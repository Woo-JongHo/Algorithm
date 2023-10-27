class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; // 터트려서 사라진 인형의 갯수
        String outnum = ""; // 저장될 인형의 숫자

        for (int i = 0; i < moves.length; i++) {
            int slot = moves[i];
            for (int j = 0; j < board.length; j++) {
                if (board[j][slot - 1] != 0) {
                    outnum = outnum + String.valueOf(board[j][slot - 1]);
                    //System.out.println("저장된 숫자는" + outnum);
                    int length = outnum.length();
                    if (length >= 2 && outnum.charAt(length - 1) == outnum.charAt(length - 2)) {
                        // 뒤의 두 숫자가 같으면 제거
                        outnum = outnum.substring(0, length - 2);
                        //System.out.println("터진다음 저장된 숫자는 :" + outnum);
                        answer += 2; // 터진 인형 2개 추가
                     
                    }
                    board[j][slot - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}






