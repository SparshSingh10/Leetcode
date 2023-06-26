class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(i, j, n, m, grid);
                }
            }
        }

        return count;
    }

    private void dfs(int i, int j, int n, int m, char[][] grid) {
        if (!isValid(i, j, n, m, grid)) {
            return;
        }

        grid[i][j] = '0'; // Mark the current cell as visited

        // Explore the neighboring cells in all four directions
        dfs(i + 1, j, n, m, grid);
        dfs(i - 1, j, n, m, grid);
        dfs(i, j + 1, n, m, grid);
        dfs(i, j - 1, n, m, grid);
    }

    private boolean isValid(int i, int j, int n, int m, char[][] grid) {
        return i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == '1';
    }
}
