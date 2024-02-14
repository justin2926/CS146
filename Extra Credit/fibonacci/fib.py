def fibRecursive(n):
    if (n == 1 or n == 2):
        return 1
    return fibRecursive(n-1) + fibRecursive(n-2)

print(fibRecursive(10))
print("Expected: 55")