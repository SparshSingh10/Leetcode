import java.util.ArrayList;

class Solution {
    private void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] vis) {
        vis[node] = 1;
        for (int i = 0; i < adjLs.get(node).size(); i++) {
            int neighbor = adjLs.get(node).get(i);
            if (vis[neighbor] == 0) {
                dfs(neighbor, adjLs, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        // make arraylist
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
// create a list
        for (int i = 0; i < isConnected.length; i++) {
            adjLs.add(new ArrayList<>());
        }
        // change matrix to arraylist
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        int[] vis = new int[isConnected.length];
        int c = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (vis[i] == 0) {
                c++;
                dfs(i, adjLs, vis);
            }
        }

        return c;
    }
}
