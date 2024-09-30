def solution(word):
    seen = set()  
    prev_char = ''  
    
    for char in word:
        if char != prev_char:
            if char in seen:  #
                return False
            seen.add(char)  
        prev_char = char  #
        
    return True  


n = int(input())  
words = [input().strip() for _ in range(n)]  

count = sum(1 for word in words if solution(word))

print(count)