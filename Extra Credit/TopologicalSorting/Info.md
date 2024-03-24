### Bonus Questions: "Topological Sorting and other party tricks"

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
