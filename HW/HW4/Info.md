## Analysis of Insertion Sort algorithm:
```Java
// 1. void insertionSort(int arr[]) 
// 2.     { 
// 3. 1 time           int n = arr.length; 
// 4. n+1 times        for (int i = 1; i < n; ++i) { 
// 5. 1 time                  int key = arr[i]; 
// 6. 1 time                 int j = i - 1;
// 7. n(n+1) times           while (j >= 0 && arr[j] > key) { 
// 8. n(n) times               arr[j + 1] = arr[j]; 
// 9. n(n) times               j = j - 1; 
// 10. -                     } 
// 11. 1 time                arr[j + 1] = key; 
// 12. -               } 
// 13.   } 
```
- 1 + (n+1) + 1 + 1 + n(n+1) + n(n) + n(n) + 1 = 
- (n+1) + n(n+1) + n(n) + n(n) + 4 =
- (n+1) + ((n^2)+n) + n^2 + n^2 + 4 = 
- ((n^2)+n) + 2(n^2) + (n+1) + 4 = n^2 (quadratic time)

## Analysis of Matrix:
```Java
// 1. 1 time   MATRIX_MULTIPLY(A, B): 
// 2. 1 time    if columns(A) ≠ rows(B): 
// 3. n times      raise ValueError("Matrix multiplication is not defined.") 
// 4.   
// 5.     rows_A ← number of rows in A 
// 6.     cols_A ← number of columns in A 
// 7.     cols_B ← number of columns in B 
// 8.     result ← matrix of size rows_A x cols_B filled with zeros 
// 9.   
// 10.     for i from 1 to rows_A do: 
// 11.       for j from 1 to cols_B do: 
// 12.       sum ← 0 
// 13.           for k from 1 to cols_A do: 
// 14.             sum ← sum + A[i][k] * B[k][j] 
// 15.           result[i][j] ← sum 
// 16.     return result
```
