class Solution {
    public void solve(char[][] board) {
        if (board==null || board.length==0)
            return;
        int rows=board.length;
        int cols=board[0].length;
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        boolean isBoundary = i == 0 || i == rows - 1 || j == 0 || j == cols - 1;
        if (isBoundary && board[i][j] == 'O')
            dfs(board, i, j);
    }
}
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'B')
                    board[i][j] = 'O';
            }
        }
    }
       public void dfs(char[][] board, int i, int j) {
        int rows = board.length;
        int cols = board[0].length;
        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'O')
            return;
        board[i][j] = 'B';
        dfs(board, i - 1, j); // Up
        dfs(board, i + 1, j); // Down
        dfs(board, i, j - 1); // Left
        dfs(board, i, j + 1); // Right
    }
}
