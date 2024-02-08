def isBadVersion(n):
    return n == 4 or n == 5 or n == 6


def firstBadVersion(x):
    first = 1
    last = x
    while first < last:
        mid = (first + last) / 2
        if isBadVersion(mid):
            last = mid
        else:
            first = mid + 1
        return first


print(firstBadVersion(5))
