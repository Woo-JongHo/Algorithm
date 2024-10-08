import math

rh, rv, sh, sv = map(int, input().split())
sz = int(input())
min_price = 1000000000

for i in range(sz):
    rhi, rvi, shi, svi, pi = map(int, input().split())

    # 회전하지 않은 경우: 모니터의 가로, 세로 해상도와 크기로 계산
    horizontal = max(math.ceil(rh / rhi), math.ceil(sh / shi))
    vertical = max(math.ceil(rv / rvi), math.ceil(sv / svi))
    # 최소 비용 갱신
    min_price = min(min_price, horizontal * vertical * pi)

    # 회전한 경우: 모니터를 회전해서 가로와 세로를 뒤바꿔 계산
    horizontal = max(math.ceil(rh / rvi), math.ceil(sh / svi))
    vertical = max(math.ceil(rv / rhi), math.ceil(sv / shi))
    # 최소 비용 갱신
    min_price = min(min_price, horizontal * vertical * pi)
print(min_price)
