def min_moves(x, y):
    distance = y - x
    move = 0
    total_distance = 0
    while total_distance < distance:
        move += 1
        total_distance += (move + 1) // 2  
    return move

T = int(input())
results = []
for _ in range(T):
    x, y = map(int, input().split())
    results.append(min_moves(x, y))

for result in results:
    print(result)
