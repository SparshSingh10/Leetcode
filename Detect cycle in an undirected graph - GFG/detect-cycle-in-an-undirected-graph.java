//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


// import java.util.ArrayList;

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V]; // Keep track of visited nodes

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclic(i, -1, adj, visited)) {
                    return true; // Graph contains a cycle
                }
            }
        }

        return false; // No cycle found
    }

    private boolean isCyclic(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true; // Mark current node as visited

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (isCyclic(neighbor, node, adj, visited)) {
                    return true; // Cycle detected in the subtree
                }
            } else if (neighbor != parent) {
                return true; // Back edge found (cycle detected)
            }
        }

        return false; // No cycle found in the subtree
    }
}
