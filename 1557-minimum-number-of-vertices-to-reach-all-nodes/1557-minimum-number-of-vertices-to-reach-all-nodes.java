import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        boolean[] incoming = new boolean[n];
        
        // Mark vertices with incoming edges
        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            incoming[v] = true;
        }
        
        // Add vertices with no incoming edges to the result
        for (int i = 0; i < n; i++) {
            if (!incoming[i]) {
                result.add(i);
            }
        }
        
        return result;
    }
}
