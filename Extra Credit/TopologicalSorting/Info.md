### Bonus Questions: "Topological Sorting and other party tricks"

The code below topologically sorts the nodes using Kahn's Algorithm, BFS, and DFS. With Kahn's Algorithm, this removes nodes with no indegrees which creates a topologically sorted order. With BFS, since you're exploring the graph by each level, this would lead to a topological order. With DFS, since you're exploring the graph deep, you would also achieve a topologically order but you would have to reverse it after you finished.

## Kahn's Algorithm
```Java
private void topologicalSort(TreeNode root) {

	int indegree[] = new int[root.size()];

	for (int i = 0; i < root.size(); i++) {
		indegree[i]++;
	}

	Queue<Integer> q = new LinkedList<>();

	for (int i = 0; i < root.size(); i++) {
		if (indegree[i] == 0) {
			q.add(i);
		}
	}

	while (!q.isEmpty()) {
		for (int i = 0; i < root.size(); i++) {
			indegree[i]--;
			if (indegree[i] == 0) {
				topologicalSort();
			}
		}
	}
}
```
Input:
0 -> 1
1 -> 2
2 -> 3

Output:
\[0, 1, 2, 3]

## BFS
```Java
  public static List<Integer> topologicalSortBFS(TreeNode root) {
	int[] indegree = new int[root.size];
	
	for (int i = 0; i < root.size(); i++) {
		indegree[i]++;
	}
	
	Queue<Integer> queue = new LinkedList<>();
	List<Integer> list = new ArrayList<>();
	
	for (int i = 0; i < n; i++) {
		if (indegree[i] == 0) {
			queue.add(i);
		}
	}
	
	while (!queue.isEmpty()) {
		int node = queue.poll();
		list.add(node); 
	
		for (int neighbor : adjList.get(node)) {
			indegree[neighbor]--;
			if (indegree[neighbor] == 0) {
				queue.add(neighbor);
			}
		}
	}
	
	
	return list;
	}
```
Input:
0 -> 1
1 -> 2
2 -> 3

Output:
\[0, 1, 2, 3]

## DFS
```Java

	public static List<Integer> topologicalSortDFS(List<List<Integer>> list) {
		List<Integer> sortedList = new ArrayList<>();
		boolean[] visited;
		int n = adjList.size();
		visited = new boolean[n];
	
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visit(list, i);
			}
		}
	
		Collections.reverse(sortedList);
		return sortedList;
	}
	
	private static void visit(List<List<Integer>> adjList, int node) {
		visited[node] = true;
		
		for (int neighbor : adjList.get(node)) {
			if (!visited[neighbor]) {
				dfsVisit(adjList, neighbor);
			}
		}
	}
```
Input:
0 -> 1
1 -> 2
2 -> 3

Output:
\[3, 2, 1, 0]
