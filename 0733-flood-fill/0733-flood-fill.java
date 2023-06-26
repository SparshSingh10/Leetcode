class Solution {
    public int[][] floodFill(int[][] grid, int sr, int sc, int color) {
    
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        int x=grid[sr][sc];
         if (x == color) {
            return grid; // No need to perform flood fill if the starting color is already the target color
        }
        
                dfs(sr,sc,n,m,grid,x,color);
           
        return grid;
    }
   public void dfs(int i, int j, int n, int m, int[][] grid, int x, int color) {
    if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != x)
        return;

 
    grid[i][j] = color;

    dfs(i, j + 1, n, m, grid, x, color);
    dfs(i, j - 1, n, m, grid, x, color);
    dfs(i + 1, j, n, m, grid, x, color);
    dfs(i - 1, j, n, m, grid, x, color);
}
    }
