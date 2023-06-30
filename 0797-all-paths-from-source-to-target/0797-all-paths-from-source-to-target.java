import java.util.*;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // Initialize the result list to store all paths
        List<List<Integer>> result = new ArrayList<>();
        
        // Initialize the path list to keep track of the current path
        List<Integer> path = new ArrayList<>();
        
        // Add the source node (0) to the path
        path.add(0);
        
        // Call the depth-first search (DFS) method to find all paths
        dfs(graph, 0, result, path);
        
        // Return the list of all paths
        return result;
    }
    
    // Depth-first search (DFS) method to traverse the graph and find all paths
    private void dfs(int[][] graph, int node, List<List<Integer>> result, List<Integer> path) {
        // If the current node is the target node (last node), add a copy of the path to the result
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
            return;
        }
        
        // Iterate through the neighbors of the current node
        for (int neighbor : graph[node]) {
            // Add the neighbor to the path
            path.add(neighbor);
            
            // Recursively call the DFS method for the neighbor
            dfs(graph, neighbor, result, path);
            
            // Remove the neighbor from the path to backtrack and explore other paths
            path.remove(path.size() - 1);
        }
    }
}
