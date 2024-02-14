## Problem 1:

- 10000000000n^2 vs n^3
  - n^3 is bigger (ignore the constant)
- n^2 log(n) vs n(log(n))^10
  - n^2 log(n)
- n^(log(n)) vs 2^(sqrt(n))
  - n^(log(n)) is bigger 
- 2^n vs 2^(2n)
  - 2^(2n)

## Problem 2:

```
1. 1 time         isPrime(n): 
2. n+1 times      for(i = 2, i*i <= n; i++) {
3. n times          if(n % x == 0) {
4. 1 time             return false
5. -                }
6. 1 time         return true
```

- Best case: O(1)
- Worst case: O(sqrt(n))
- Average case: O(sqrt(n))