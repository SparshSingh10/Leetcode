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

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for (int i = 0; i < m * n; i++) {
            adjLs.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    int index = i * n + j;
                    if (i > 0 && grid[i - 1][j] == '1') {
                        int upIndex = (i - 1) * n + j;
                        adjLs.get(index).add(upIndex);
                        adjLs.get(upIndex).add(index);
                    }
                    if (j > 0 && grid[i][j - 1] == '1') {
                        int leftIndex = i * n + (j - 1);
                        adjLs.get(index).add(leftIndex);
                        adjLs.get(leftIndex).add(index);
                    }
                }
            }
        }

        int[] vis = new int[m * n];
        int count = 0;

        for (int i = 0; i < m * n; i++) {
            if (vis[i] == 0 && grid[i / n][i % n] == '1') {
                count++;
                dfs(i, adjLs, vis);
            }
        }

        return count;
    }
}
