def dfs(board, x, y, path, depth, result):
    if depth == 6:
        result.add(path)
        return
    
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    
    for dx, dy in directions:
        nx, ny = x + dx, y + dy
        if 0 <= nx < 5 and 0 <= ny < 5:
            dfs(board, nx, ny, path + board[nx][ny], depth + 1, result)

def find_unique_numbers(board):
    result = set()
    
    for i in range(5):
        for j in range(5):
            dfs(board, i, j, board[i][j], 1, result)
    
    return len(result)

# 입력 받기
board = [input().split() for _ in range(5)]

# 결과 출력
print(find_unique_numbers(board))
