## Approach used to solve:

- First, I created an adjacency list representation of the graph where the nodes are represented by indices and edges are represented by a set

- Next, I implemented a BFS algorithm to traverse through the graph from each node and count the number of nodes within the threshold. This allows us to explore the graph level by level while keeping track of the distance from the starting node.

- Then, I terated through each node in the graph and for each of them, I call my BFS method. I also used a priority queue to prioritize nodes based on their distance to make sure that nodes are being explored in ascending number of distance.

- Time complexity: O(V+E) where V = vertices, E = edges
- Space complexity: O(V+E) where V = vertices, E = edges
