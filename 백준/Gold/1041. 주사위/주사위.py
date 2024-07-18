import sys

def main():
    N = int(input())
    arr = list(map(int, sys.stdin.readline().split()))
    
    if N == 1:
        print(sum(sorted(arr)[:5]))
        return
    
    min_lists = [min(arr[0], arr[5]), min(arr[1], arr[4]), min(arr[2], arr[3])]
    min_lists.sort()

    min1, min2, min3 = min_lists[:3]

    n1 = 5 * (N ** 2) - 8 * N + 4
    n2 = 8 * N - 8
    n3 = 4

    ans = min1 * n1 + min2 * n2 + min3 * n3
    print(ans)

if __name__ == '__main__':
    main()
