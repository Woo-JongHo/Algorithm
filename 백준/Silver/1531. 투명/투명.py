# 입력을 받아 처리하기 위한 기본 설정
import sys
input = sys.stdin.read

def count_covered_cells(N, M, papers):
    # 100x100 그림 초기화
    grid = [[0] * 100 for _ in range(100)]

    # 종이로 덮인 영역을 카운트
    for paper in papers:
        x1, y1, x2, y2 = paper
        for i in range(x1-1, x2):
            for j in range(y1-1, y2):
                grid[i][j] += 1
    
    # M개 이상의 종이로 덮인 셀의 개수 세기
    covered_count = 0
    for i in range(100):
        for j in range(100):
            if grid[i][j] > M:
                covered_count += 1
                
    return covered_count

# 입력 처리
data = input().strip().split()
N = int(data[0])
M = int(data[1])
papers = []
for i in range(N):
    x1 = int(data[2 + 4*i])
    y1 = int(data[3 + 4*i])
    x2 = int(data[4 + 4*i])
    y2 = int(data[5 + 4*i])
    papers.append((x1, y1, x2, y2))

# 결과 계산 및 출력
result = count_covered_cells(N, M, papers)
print(result)
