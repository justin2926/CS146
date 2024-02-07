import re

a = "racecar"
b = "le@v()el"
c = "not a palindome"

def isPalindrome(s):
    lc = s.lower()
    m = re.sub("[^a-zA-Z0-9]", "", lc)
    z = list(m)
    r = z[::-1]

    if (z == r):
        return True
    else:
        return False

print(isPalindrome(a))
print("Expected: true\n")

print(isPalindrome(b))
print("Expected: true\n")

print(isPalindrome(c))
print("Expected: false\n")






