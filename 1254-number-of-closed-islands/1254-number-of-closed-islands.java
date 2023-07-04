class Solution {
    public void dfs(int i, int j, int n, int m, int[][] grid) {
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != 0) {
            return;
        }
        grid[i][j] = 1;

       
        dfs(i + 1, j, n, m, grid); // Down
        dfs(i - 1, j, n, m, grid); // Up
        dfs(i, j + 1, n, m, grid); // Right
        dfs(i, j - 1, n, m, grid);
    }

    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Boundary DFS
        for (int i = 0; i < n; i++) {
            dfs(i, 0, n, m, grid);
            dfs(i, m - 1, n, m, grid);
        }

        for (int j = 0; j < m; j++) {
            dfs(0, j, n, m, grid);
            dfs(n - 1, j, n, m, grid);
        }

        // Call DFS in the whole grid
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    ans++;
                    dfs(i, j, n, m, grid);
                }
            }
        }

        return ans;
    }
}
