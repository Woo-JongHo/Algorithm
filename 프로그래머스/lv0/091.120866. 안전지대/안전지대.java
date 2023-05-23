class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int count = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    if (j - 1 >= 0 && board[i][j - 1] == 0) // 왼쪽
                        board[i][j - 1] = 2;
                    if (j + 1 < board.length && board[i][j + 1] == 0) // 오른쪽
                        board[i][j + 1] = 2;
                    if (i - 1 >= 0 && board[i - 1][j] == 0) // 위
                        board[i - 1][j] = 2;
                    if (i + 1 < board.length && board[i + 1][j] == 0) // 아래
                        board[i + 1][j] = 2;
                    if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 0) // 대각선 1
                        board[i - 1][j - 1] = 2;
                    if (i - 1 >= 0 && j + 1 < board.length && board[i - 1][j + 1] == 0) // 대각선 2
                        board[i - 1][j + 1] = 2;
                    if (i + 1 < board.length && j - 1 >= 0 && board[i + 1][j - 1] == 0) // 대각선 3
                        board[i + 1][j - 1] = 2;
                    if (i + 1 < board.length && j + 1 < board.length && board[i + 1][j + 1] == 0) // 대각선 4
                        board[i + 1][j + 1] = 2;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != 0)
                    count++;
            }
        }

        answer = (board.length * board.length) - count;
        return answer;
    }
}
