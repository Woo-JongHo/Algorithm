def main(x, y, w, h):
    left = x
    right = w - x
    bottom = y
    top = h - y

    return min(left, right, bottom, top)

x, y, w, h = map(int, input().split())

print(main(x, y, w, h))
