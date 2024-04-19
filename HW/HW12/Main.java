public class hw12 {

	class Edge {
		int from, to, cost;

		Edge(int from, int to, int cost) {
			this.from = from; this.to = to; this.cost = cost;
		}
	}
	
	class DisjointSet {
		private int[] parent, rank;
		
		public DisjointSet(int size) {
			parent = new int[size+1]; rank = new int[size+1];
			for (int i = 0; i <= size; i++) {
				parent[i] = i;
				rank[i] = 0;
			}
		}
		
		public int find(int x) {
			if (parent[x] != x) {
				parent[x] = find(parent[x]);
			}
			return parent[x];
		}
		
		public void union(int x, int y) {
			int rootX = find(x), rootY = find(y);
			
			if (rootX == rootY) {
				return;
			}
			
			if (rank[rootX] < rank[rootY]) {
				parent[rootX] = rootY;
			} else if (rank[rootX] > rank[rootY]) {
				parent[rootY] = rootX;
			} else {
				parent[rootY] = rootX;
				rank[rootX]++;
			}
		}
	}

	public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {

		List<Edge> eList = new ArrayList<>();

		for (int[] p : pipes) {
			int house1 = p[0], house2 = p[1], cost = p[2];
			eList.add(new Edge(house1, house2, cost));
		}

		for (int i = 0; i < wells.length; i++) {
			eList.add(new Edge(0, i + 1, wells[i]));
		}

		Collections.sort(eList, Comparator.comparingInt(edge -> edge.cost));
		
		DisjointSet d = new DisjointSet(n);
		
		int total = 0;
		for (Edge e: eList) {
			int from = d.find(e.from), to = d.find(e.to);
			
			if (from != to) {
				total += e.cost;
				d.union(from, to);
			}
		}

		return total;
	}
}
