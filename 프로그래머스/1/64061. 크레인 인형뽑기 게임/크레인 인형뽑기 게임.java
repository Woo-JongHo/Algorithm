class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; // 터트려서 사라진 인형의 갯수
        String outnum = ""; // 저장될 인형의 숫자

        for (int i = 0; i < moves.length; i++) {
            int slot = moves[i];
            int j;
            for (j = 0; j < board.length; j++) {
                if (board[j][slot - 1] != 0) {
                    int currentDoll = board[j][slot - 1];

                    if (!outnum.isEmpty() && outnum.charAt(outnum.length() - 1) == (char) (currentDoll + '0')) {
                        // 뒤의 숫자와 같으면 제거
                        int length = outnum.length();
                        outnum = outnum.substring(0, length - 1);
                        answer += 2; // 터진 인형 2개 추가
                    } else {
                        outnum += (char) (currentDoll + '0'); // 문자열에 인형 추가
                    }

                    board[j][slot - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
