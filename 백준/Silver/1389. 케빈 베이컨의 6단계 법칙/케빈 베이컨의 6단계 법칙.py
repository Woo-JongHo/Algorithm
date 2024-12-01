import sys

def floyd_warshall(n, edges):
    INF = float('inf')
    # 인접 행렬 초기화
    graph = [[INF] * (n + 1) for _ in range(n + 1)]
    for i in range(1, n + 1):
        graph[i][i] = 0

    # 간선 정보 추가
    for a, b in edges:
        graph[a][b] = 1
        graph[b][a] = 1

    # 플로이드-워셜 알고리즘
    for k in range(1, n + 1):
        for i in range(1, n + 1):
            for j in range(1, n + 1):
                graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j])

    return graph

def find_kevin_bacon(graph, n):
    min_kevin_bacon = float('inf')
    result_person = -1

    for i in range(1, n + 1):
        kevin_bacon_sum = sum(graph[i][1:])
        if kevin_bacon_sum < min_kevin_bacon:
            min_kevin_bacon = kevin_bacon_sum
            result_person = i
        elif kevin_bacon_sum == min_kevin_bacon and i < result_person:
            result_person = i

    return result_person

if __name__ == "__main__":
    input = sys.stdin.read
    data = input().splitlines()
    n, m = map(int, data[0].split())
    edges = [tuple(map(int, line.split())) for line in data[1:]]

    graph = floyd_warshall(n, edges)
    result = find_kevin_bacon(graph, n)
    print(result)
