## Approaches used to solve:
- I solved this problem using breadth-first search. I used this algorithm rather than something like depth-first search because it traverses a tree level by level rather than going deep into the children leaves first then backing out.
- In order to implement this algorithm, I used a queue which would store the visited nodes. This starts off by first adding the root node into the queue then adds it into a sublist. After that, it gets removed from the queue and then its children are added to the queue and a new sublist. This repeats until there are no children left.
- Finally, the sublists are added into one big list and returned.
