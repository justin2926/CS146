def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
    def bfs(graph, s, k):
        q = [(0, s)]  # (distance, node)
        visited = [False] * len(graph)
        node_count = -1
        
        while q:
            distance, node = heapq.heappop(q)
            
            if visited[node]:
                continue
            
            visited[node] = True
            node_count += 1
            
            for neighbor, weight in graph[node]:
                if not visited[neighbor] and weight + distance <= k:
                    heapq.heappush(q, (weight + distance, neighbor))
        
        return node_count
    
    graph = [[] for _ in range(n)]
    
    for e in edges:
        graph[e[0]].append((e[1], e[2]))
        graph[e[1]].append((e[0], e[2]))
    
    city = 0
    min_count = n + 1
    
    for i in range(n):
        count = bfs(graph, i, distanceThreshold)
        if count <= min_count:
            city = i
            min_count = count
    
    return city
