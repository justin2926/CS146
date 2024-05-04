## Approach used to solve:
- In this problem, I solved it using dynamic programming. First, I created an array of size `amount+1` which stores the min number of coins required for each amount. Then I iterated through each amount from 1 to amount and for each amount, I iterate again through each coin in the coins input array.
- If `a - coin` is >= 0, then we can get the remaining amount `a-coin`.
- After completing this, I would return the result and if the amount of the array is equal to `amount+1`, I would return -1 which indicates it's not possible to create the amount.
- Time Complexity: O(Nk) where N = amount, k = size of coins
- Space Compleity: O(N) where N = amount
