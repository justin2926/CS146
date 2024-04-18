public int findTheCity(int n, int[][] edges, int distanceThreshold) {
    
    ArrayList<int[]>[] graph = new ArrayList[n];
  
    for(int i = 0; i < n; i++){
        graph[i] = new ArrayList<>();
    }
  
    for(int[] e: edges){
        graph[e[0]].add(new int[] {e[1],e[2]});
        graph[e[1]].add(new int[] {e[0],e[2]}); 
    }
  
    int city = 0;
    int min = n+1;
    
    for(int i=0;i<n;i++){
        int count = bfs(graph, i, distanceThreshold);
        if(count <= min){
            city = i;
            min = count;
        }
    }
  
    return city;
}

private int bfs(ArrayList<int[]>[] graph, int s, int k){
    
    PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[1]-b[1]);
    q.add(new int[] {s,0});
    boolean[] visited = new boolean[graph.length];
    int nodeCount = -1; 
  
    while(q.size() != 0){
        int[] temp = q.poll();
      
        if (visited[temp[0]]) {
          continue;
        }
      
        visited[temp[0]] = true;
        nodeCount++;
        
        for(int[] x: graph[temp[0]]){
            if(visited[x[0]] != true && x[1] + temp[1] <= k) { 
                q.add(new int[] {x[0], x[1] + temp[1]});
            }
        }
    }
  
    return nodeCount; 
}
