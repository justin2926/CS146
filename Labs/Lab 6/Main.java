public boolean canFinish(int numCourses, int[][] prerequisites) {
    int size = prerequisites.length;

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    for(int i = 0; i < numCourses ;i++) {
        list.add(new ArrayList<>());
    }

    for(int i = 0; i < size; i++) {
        list.get(prerequisites[i][0]).add(prerequisites[i][1]);
    }

    int[] inDegree = new int[numCourses];
  
    for(int i = 0; i < numCourses; i++) {
        for(int x: list.get(i)){
            inDegree[x]++;
        }
    }

    Queue<Integer> queue = new LinkedList<>();
    for(int i = 0; i < numCourses; i++) {
        if (inDegree[i]==0) {
            queue.add(i);
        } 
    }

    ArrayList<Integer> result = new ArrayList<>();

    while (!queue.isEmpty()) {
        int n = queue.poll();

        result.add(n);
        
        for(int i: list.get(n)) {
            inDegree[i]--;

            if (a[i] == 0) {
                queue.add(i);
            }
        }
    }

    if (result.size() != numCourses) {
        return false;
    }

    return true;
}
