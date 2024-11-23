from collections import defaultdict, deque
import sys
input = sys.stdin.read

def check_tree(root, graph, visited):
    queue = deque([root])
    node_count = 0
    edge_count = 0

    while queue:
        current = queue.popleft()
        if visited[current]:
            continue
        visited[current] = True
        node_count += 1

        for neighbor in graph[current]:
            edge_count += 1
            if not visited[neighbor]:
                queue.append(neighbor)

    # 무방향 그래프이므로 간선 수는 반으로 나눔
    return (edge_count // 2) + 1 == node_count

def main():
    data = input().strip().split("\n")
    test_case = 1
    index = 0

    while index < len(data):
        n, m = map(int, data[index].split())
        index += 1

        if n == 0 and m == 0:
            break

        graph = defaultdict(list)
        visited = [False] * (n + 1)

        # 그래프 입력 처리
        for _ in range(m):
            a, b = map(int, data[index].split())
            index += 1
            graph[a].append(b)
            graph[b].append(a)

        tree_count = 0
        for i in range(1, n + 1):
            if not visited[i]:
                if check_tree(i, graph, visited):
                    tree_count += 1

        # 결과 출력
        if tree_count > 1:
            print(f"Case {test_case}: A forest of {tree_count} trees.")
        elif tree_count == 1:
            print(f"Case {test_case}: There is one tree.")
        else:
            print(f"Case {test_case}: No trees.")

        test_case += 1

if __name__ == "__main__":
    main()
