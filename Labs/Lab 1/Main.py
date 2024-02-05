x = [3, 1, 9]
y = [1, 7, 3, 2, 11]
z = [3, 2]

def two_sum(n, k):
    for i in range(len(n)):
        for j in range(i+1, len(n)):
            if n[i] + n[j] == k:
                return [i, j]

print(two_sum(x, 12))
print("Expected output: [0, 2]\n")

print(two_sum(y, 9))
print("Expected output: [1, 3]\n")

print(two_sum(z, 5))
print("Expected output: [0, 1]\n")
