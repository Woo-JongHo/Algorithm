from collections import Counter

def make_palindrome(name):
    count = Counter(name)
    
    odd_char = ''
    odd_count = 0
    for char, cnt in count.items():
        if cnt % 2 == 1:
            odd_char = char
            odd_count += 1
    
    if odd_count > 1:
        return "I'm Sorry Hansoo"
    
    half_palindrome = []
    for char in sorted(count.keys()):
        half_palindrome.append(char * (count[char] // 2))
    
    first_half = ''.join(half_palindrome)
    second_half = first_half[::-1]
    
    if odd_char:
        return first_half + odd_char + second_half
    else:
        return first_half + second_half

name = input().strip()

print(make_palindrome(name))
