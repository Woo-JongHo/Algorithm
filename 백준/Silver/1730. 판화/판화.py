n = int(input())
m = input()

p = [[False] * 100 for _ in range(100)]  # 수직으로 지나간 위치
h = [[False] * 100 for _ in range(100)]  # 수평으로 지나간 위치
row, col = 0, 0  # 초기 위치

def is_valid_location(row, col):
    return 0 <= row < n and 0 <= col < n

for command in m:
    if command == 'U':
        if not is_valid_location(row - 1, col):
            continue
        p[row][col] = True
        row -= 1
        p[row][col] = True
    elif command == 'D':
        if not is_valid_location(row + 1, col):
            continue
        p[row][col] = True
        row += 1
        p[row][col] = True
    elif command == 'L':
        if not is_valid_location(row, col - 1):
            continue
        h[row][col] = True
        col -= 1
        h[row][col] = True
    elif command == 'R':
        if not is_valid_location(row, col + 1):
            continue
        h[row][col] = True
        col += 1
        h[row][col] = True

for i in range(n):
    for j in range(n):
        if p[i][j] and h[i][j]:
            print("+", end="")
        elif p[i][j]:
            print("|", end="")
        elif h[i][j]:
            print("-", end="")
        else:
            print(".", end="")
    print()
