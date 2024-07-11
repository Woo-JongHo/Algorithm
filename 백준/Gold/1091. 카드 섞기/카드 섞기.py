def min_shuffle_count(N, P, S):
    # 초기 상태 설정
    current = list(range(N))
    
    # 목표 상태 확인 함수
    def is_target_state(state):
        for i in range(N):
            if state[i] % 3 != P[i]:
                return False
        return True
    
    # 상태를 섞는 함수
    def shuffle(state):
        return [state[S[i]] for i in range(N)]
    
    # 무한 루프 방지를 위한 상태 저장
    visited = set()
    
    # 현재 상태와 섞기 횟수를 저장하는 큐
    from collections import deque
    queue = deque([(current, 0)])
    
    while queue:
        state, count = queue.popleft()
        
        # 현재 상태가 목표 상태인지 확인
        if is_target_state(state):
            return count
        
        # 상태를 튜플로 변환하여 방문 여부 확인
        state_tuple = tuple(state)
        if state_tuple in visited:
            continue
        visited.add(state_tuple)
        
        # 상태를 섞고 큐에 추가
        new_state = shuffle(state)
        queue.append((new_state, count + 1))
    
    return -1

# 입력
N = int(input())
P = list(map(int, input().split()))
S = list(map(int, input().split()))

# 결과 출력
print(min_shuffle_count(N, P, S))
