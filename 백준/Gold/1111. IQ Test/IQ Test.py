import sys
from typing import Union

input = sys.stdin.readline

N = int(input().rstrip())
nums = list(map(int, input().rstrip().split()))

def solution() -> Union[int, str]:
    if N == 1:
        return "A"
    if N == 2:
        if nums[0] == nums[1]:
            return nums[0]
        else:
            return "A"

    a = 0 if nums[1] == nums[0] else (nums[2] - nums[1]) // (nums[1] - nums[0])
    b = nums[1] - nums[0] * a

    for i in range(N - 1):
        if a * nums[i] + b != nums[i + 1]:
            return "B"
    return a * nums[-1] + b

print(solution())
