class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int rows = grid.length;
        int[] sum = new int[1];
        sum[0] = 0;
        int max = 0;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, sum);
                    max = Math.max(max, sum[0]);
                    sum[0] = 0;
                }
            }
        }
        return max;
    }

    public void dfs(int[][] grid, int i, int j, int[] sum) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (i < 0 || i >= rows || j < 0 || j >= cols|| grid[i][j] != 1)
            return;
            sum[0]++;
        grid[i][j] = -1; 
        dfs(grid, i - 1, j, sum); // Up
        dfs(grid, i + 1, j, sum); // Down
        dfs(grid, i, j - 1, sum); // Left
        dfs(grid, i, j + 1, sum); // Right
    }
}
