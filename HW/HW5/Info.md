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




_
- T(N) = 3T(N-1) + n
  - ### Recurrence Relation
    - T(N) = 3[3T(N-2) + n] + n
    - T(N) = (3^2) T(N-2) + 3n + n
    - T(N) = (3^k) T(N-k) + (3^(k-1)) + (3^(k-2)) + ...
    - Assume n-k = 0, n = k
    - 3^n + 3^n - 1
    - **O(3^n)** ?
  - ### Master Method
    - a = 3
    - b = 1
    - f(n) = n
    - k = 1
    - Since a > 1, T(n) = O(n^1 * 3n/3) = O(n^1 * n) = **O(n^2)**




_
- T(N) = 9T(N/2) + n^2
  - ### Recurrence Relation
    - T(N/2) = 9T(N/2) + (N/2)^2
    - T(N/4) = 9T(N/8) + (N/4)^2
    - T(N) = n^2 * (1 + 9/4 + 81/16 + ...) 
    - = n^2 * (4/3) / (1 - 9/4) 
    - = **Θ(n^2 log n)**
  - ### Master Method
    - a = 9
    - b = 2
    - f(n) = n^2
    - d = 2
    - 2 < log_2 (9)
    - So **O(n^lg_n)**




_
- T(N) = 100T(N/2) + n^log_2(cn) + 1  (c is a constant)
  - ### Recurrence Relation
    - n^log_2(cn) = c * n^(log_2(c) + log_2(n))
    - Assume x = log_2(n)
    - T(2^x) = 100T(2^(x-1)) + c * (2^x)^(log_2(c) + x) + 1
    - O(n^(log_2(c) + 1)) 
    - = O(n * n^(log_2(c))) 
    - = **O(n^(log_2(cn)))** ?
  - ### Master Method
    - a = 100
    - b = 2
    - f(n) = n^log_2(cn) + 1
    - d = log_2(cn)+1
    - So **O(n^(log_2(cn)))**




_
- T(N) = 4T(N/2) + n^2(logn)
  - ### Recurrence Relation
    - T(N) = 4T(N/2) + n^2(logn)
    - T(N/2) = 4T(N/4) + (N/2)^2(log(N/2))
    - T(N/4) = 4T(N/8) + (N/4)^2(log(N/4))
    - **O(n^2 log^2(n))** ?
  - ### Master Method
    - a = 4
    - b = 2
    - f(n) = n^2(logn)
    - d = 2
    - log_2(4) = 2
    - k = 1
    - **O(n^2 log^2(n))** 




_
- T(N) = 5T(N/2) + (n^2)/logn
  - ### Recurrence Relation
    - (n^2)/logn = n * n^(1/logn)
    - T(2^x) = 5T(2^(x-1)) + 2^x * 2^(x/log(2^x))
    - T(2^x) = 5T(2^(x-1)) + 2^x * 2^(x/x)
    - **O(n^(2/logn) * log(n))** ?
  - ### Master Method
    - a = 5
    - b = 2
    - f(n) = (n^2)/logn
    - d = 2
    - So **O(n^(2/logn) * log(n))**

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
