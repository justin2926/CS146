### Bonus Questions: "Topological Sorting and other party tricks"

## Kahn's Algorithm
```Java
  private void topologicalSort() {

		int indegree[] = new int[jobs.size()];

		for (int i = 0; i < jobs.size(); i++) {
			indegree[i]++;
		}

		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < jobs.size(); i++) {
			if (indegree[i] == 0) {
				q.add(i);
			}
		}

		while (!q.isEmpty()) {
			for (int i = 0; i < jobs.size(); i++) {
				indegree[i]--;
				if (indegree[i] == 0) {
					topologicalSort();
				}
			}
		}
	}
```
