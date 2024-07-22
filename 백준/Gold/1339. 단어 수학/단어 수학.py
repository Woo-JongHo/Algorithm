import sys
from collections import defaultdict

def main():
    # 입력 처리
    N = int(sys.stdin.readline())
    S = [sys.stdin.readline().strip() for _ in range(N)]
    
    # 알파벳 가중치 계산
    words = defaultdict(int)
    for s in S:
        x = len(s) - 1
        for char in s:
            words[char] += 10 ** x
            x -= 1
    
    # 가중치 내림차순 정렬
    words_values = sorted(words.values(), reverse=True)
    
    # 최대 합 계산
    result = 0
    num = 9
    for value in words_values:
        result += value * num
        num -= 1
    
    # 결과 출력
    print(result)

if __name__ == "__main__":
    main()
