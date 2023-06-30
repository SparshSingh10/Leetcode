import java.util.*;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, result, path);
        return result;
    }
    private void dfs(int[][] graph, int node, List<List<Integer>> result, List<Integer> path) {
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int neighbor : graph[node]) {
            path.add(neighbor);
            dfs(graph, neighbor, result, path);
            path.remove(path.size() - 1);
        }
    }
}
