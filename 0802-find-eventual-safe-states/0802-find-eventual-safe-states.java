class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();

        int n = graph.length;
        boolean[] visited = new boolean[n];
        boolean[] dfsVisited = new boolean[n];
        boolean[] presentCycle = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, dfsVisited, graph, presentCycle);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!presentCycle[i]) {
                ans.add(i);
            }
        }

        return ans;
    }

    public boolean dfs(int s, boolean[] visited, boolean[] dfsVisited, int[][] graph, boolean[] presentCycle) {
        visited[s] = true;
        dfsVisited[s] = true;

        for (int x : graph[s]) {
            if (!visited[x]) {
                if (dfs(x, visited, dfsVisited, graph, presentCycle)) {
                    presentCycle[s] = true;
                    return true;
                }
            } else if (visited[x] && dfsVisited[x]) {
                presentCycle[s] = true;
                return true;
            }
        }

        dfsVisited[s] = false;
        return false;
    }
}
