## Approach used to solve:
- I solved this problem using Depth-First Search.
- I created a helper method called fill which I would recursively call 4 times to check the top, down, left, and right of the current position. But before calling it 4 times, I would need to check whether the index is out of bounds or not and if the new position even matches the previous position. If the condition satisfies those requirements, then the program wouldn't do anything.
