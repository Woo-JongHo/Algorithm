n = int(input())
data = list(map(int, input().split()))
count = 0

for x in data:
    if x > 1: 
        is_prime = True
        for i in range(2, int(x ** 0.5) + 1): 
            if x % i == 0:
                is_prime = False
                break
        if is_prime:
            count += 1

print(count)
