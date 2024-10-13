def calculate_win_probability(yeondoo_name, team_name):
    combined_name = yeondoo_name + team_name
    L = combined_name.count('L')
    O = combined_name.count('O')
    V = combined_name.count('V')
    E = combined_name.count('E')
    return ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100

def find_best_team(yeondoo_name, team_names):
    max_probability = -1
    best_team = ""
    
    for team_name in team_names:
        probability = calculate_win_probability(yeondoo_name, team_name)
        
        if probability > max_probability or (probability == max_probability and team_name < best_team):
            max_probability = probability
            best_team = team_name
    
    return best_team

yeondoo_name = input().strip()
N = int(input().strip())
team_names = [input().strip() for _ in range(N)]
print(find_best_team(yeondoo_name, team_names))
