## Approaches used to solve:
- In this homework, I started off by creating two separate arrays, start and end, which will store the start and end time of each job.
- After this, I sorted them using Java's built-in sort method.
- Then I created two pointers, s and e, which will keep track of the position of the two arrays along with another variable called min which will store the minimum number of meeting rooms, or jobs in this case.
- I then iterated through the 2D array using a while loop and pointer s for the location in the array.
- If the start time is less than the end time, I would increment s and min by one. Otherwise, if it's bigger, I would increment e by one but decrement min by one. This would also take care of any overlapping jobs.
- At the end, I would just return the min variable.