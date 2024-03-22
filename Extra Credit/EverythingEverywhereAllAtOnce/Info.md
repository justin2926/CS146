## Bonus Questions: "Everything Everywhere All At Once"

#### Given an adjacency list, how can you convert it to an adjacency matrix? 
- We know that an adjacency list is a list within a list and an adjacency matrix is a 2D array.
- First what we would do is create a 2D array for the adjacency matrix and initialize each element to 0.
- Then, we will iterate through through each vertex in the adjacency list and check its neighbors.
- Next, we would set the corresponding entries in the matrix to 1

```Python
  for vertex in range(num_vertices):
    for neighbor in adj_list[vertex]:
      matrix[vertex][neighbor] = 1
      matrix[neighbor][vertex] = 1 
```

#### Given an adjacency matrix, how can you convert it to an adjacency list? 
- What we would do is iterate through each element in the matrix and if the element is equal to 1, it would represent an edge meaning they are connected so we will add it to the adjacency list.

```Python
  for i in range(num_vertices):
    for j in range(num_vertices):
      if adj_matrix[i][j] == 1:
        adj_list[i].append(j)
```

#### Given a directed graph, how can you reverse the direction of each edge? 
- In order to reverse the edge directions, we could use an adjacency matrix.
- First, we would iterate through each vertex and its neighbors in the original matrix and then for each edge from vertex to neighbor, we would basically reverse it so its from neighbor to vertex.

```Python
  for vertex in range(num_vertices):
    for neighbor in adj_list[vertex]:
      reversed_adj_list[neighbor].append(vertex)
```
