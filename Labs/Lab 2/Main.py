def isAnagram(s, t):
    a = list(s)
    b = list(t)
    
    if (sorted(a) == sorted(b)):
        return True
    else:
        return False

print(isAnagram("fired", "fried"))
print("Expected: true\n")

print(isAnagram("silent", "listen"))
print("Expected: true\n")

print(isAnagram("bread", "read"))
print("Expected: false")