class Edge:
    def __init__(self, from_, to, cost):
        self.from_ = from_
        self.to = to
        self.cost = cost

class DisjointSet:
    def __init__(self, size):
        self.parent = [i for i in range(size + 1)]
        self.rank = [0] * (size + 1)
        
    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]
    
    def union(self, x, y):
        root_x = self.find(x)
        root_y = self.find(y)
        
        if root_x == root_y:
            return
        
        if self.rank[root_x] < self.rank[root_y]:
            self.parent[root_x] = root_y
        elif self.rank[root_x] > self.rank[root_y]:
            self.parent[root_y] = root_x
        else:
            self.parent[root_y] = root_x
            self.rank[root_x] += 1

class Solution:
    def minCostToSupplyWater(self, n, wells, pipes):
        e_list = []

        for p in pipes:
            house1, house2, cost = p
            e_list.append(Edge(house1, house2, cost))

        for i, well_cost in enumerate(wells):
            e_list.append(Edge(0, i + 1, well_cost))

        e_list.sort(key=lambda edge: edge.cost)

        d = DisjointSet(n)
        total = 0
        for e in e_list:
            from_ = d.find(e.from_)
            to = d.find(e.to)

            if from_ != to:
                total += e.cost
                d.union(from_, to)

        return total
