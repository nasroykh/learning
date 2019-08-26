a = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 140, 168]
for i in a:
    if i % 2 != 0:
        a.remove(i)
print(a)
