## Problem 1:
- T(N) = 2T(N-1) + 1
  - ### Recurrence Relation
    - T(N) = 2[2T(N-2) + 1] + 1
    - T(N) = (2^2) T(N-2)+2+1 = 2^2 [2T(N-3)+1]+2+1
    - T(N) = (2^3) T(N-3)+(2^2) + 2 + 1
    - T(N) = (2^k)T(N-k) + (2^(k-1)) + (2^(k-2)) + ...
    - Assume n-k = 0, n = k
    - 2^n + 2^n - 1
    - **O(2^n)**
  - ### Master Method
    - aT(n-b) + f(n)
    - a = 2
    - b = 1
    - f(n) = 1
    - k = 0
    - Since a > 1, T(n) = O(n^0 * 2^n/1) = **O(2^n)**
- T(N) = 3T(N-1) + n
  - ### Recurrence Relation
    - T(N) = 3[3T(N-2) + n] + n
    - T(N) = (3^2) T(N-2) + 3n + n
    - T(N) = (3^k) T(N-k) + (3^(k-1)) + (3^(k-2)) + ...
    - Assume n-k = 0, n = k
    - **O(n^2)** ?
  - ### Master Method
    - a = 3
    - b = 1
    - f(n) = n
    - k = 1
    - Since a > 1, T(n) = O(n^1 * 3n/3) = O(n^1 * n) = **O(n^2)**
- T(N) = 9T(N/2) + n^2
  - ### Recurrence Relation
  - ### Master Method
    - a = 9
    - b = 2
    - f(n) = n^2
    - d = 2
    - 2 < log_2 (9)
    - So **O(n^lg_2(9))**
- T(N) = 100T(N/2) + n^log_2(cn) + 1  (c is a constant)
  - ### Recurrence Relation
  - ### Master Method
    - a = 100
    - b = 2
    - f(n) = n^log_2(cn) + 1
    - d = log_2(cn)+1
    - 
- T(N) = 4T(N/2) + n^2(logn)
  - ### Recurrence Relation
  - ### Master Method
    - a = 4
    - b = 2
    - f(n) = n^2(logn)
    - d = 2
    - log_2(4) = 2
    - k = 1
    - **O(n^2 log^2(n))** 
- T(N) = 5T(N/2) + (n^2)/logn
  - ### Recurrence Relation
  - ### Master Method
    - a = 5
    - b = 2
    - f(n) = (n^2)/logn
    - d = 2
    - 

## Problem 2:
```
T(N)          yetAnotherFunc(n): 
1               if n > 1: 
N+1              for(i=0;i<10n;i++)
N                   doSomething;
N/2              yetAnotherFunc(n/2);
N/2              yetAnotherFunc(n/2);
```  

- T(N) = 2T(N/2) + 2N + 2 turns into... T(N) = 2T(N/2) + N
- a = 2
- b = 2
- d = 1
- d = log_2(2) = 1
- O(n^1 * lg n) = **O(n lgn)**
