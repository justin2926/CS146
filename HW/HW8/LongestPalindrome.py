class LongestPalindrome:
    def longestPalindrome(self, s: str) -> int:
        arr = [0] * 128

        for i in s:
            arr[ord(i)] += 1

        length = 0
        odd = False

        for i in arr:
            length += i // 2 * 2
            if i % 2 != 0:
                odd = True

        if odd:
            length += 1

        return length

l = LongestPalindrome()
print(l.longestPalindrome("abccccdd"))
print("Expected: 7\n")
print(l.longestPalindrome("speediskey"))
print("Expected: 5")

