## Approach used to solve:
- In this problem, what I did first was represent each pipe connection between houses and the cost of building wells as edges in a graph by creating an Edge class for information about each edge.
- Next, I created a list of edges by iterating through the pipes and wells and for each of the connection, add an edge between the houses with the cost and for each well, I added an edge between the well and house with the cost.
- Then, I sorted the list of the edges in ascending order which is important for Kruskal's Algorithm since it always picks the smallest edges without making a cycle.
- After that, I created a disjoint-set to manage connected edges and detect any cycles.
- For Kruskal's Algorithm, I iterated through the edge list and check if each edge would form a cycle when added to the MST and if it doesn't form a cycle, it will be included in the MST and the total cost would be updated.
- Finally, once all edges are iterated through and found the MST, it would return the total cost of said MST.
