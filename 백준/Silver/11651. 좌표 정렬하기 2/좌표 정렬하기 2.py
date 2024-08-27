import sys

input = sys.stdin.read

def main():
    data = input().splitlines()
    N = int(data[0])
    
    coordinates = []
    for i in range(1, N + 1):
        x, y = map(int, data[i].split())
        coordinates.append((x, y))
    
    coordinates.sort(key=lambda coord: (coord[1], coord[0]))
    
    for coord in coordinates:
        print(coord[0], coord[1])

if __name__ == "__main__":
    main()
