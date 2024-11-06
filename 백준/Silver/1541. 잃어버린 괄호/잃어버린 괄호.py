def minimize_expression(expression):
    parts = expression.split('-')
    initial_sum = sum(map(int, parts[0].split('+')))
    for part in parts[1:]:
        initial_sum -= sum(map(int, part.split('+')))
    return initial_sum
expression = input().strip()
print(minimize_expression(expression))
