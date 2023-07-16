class Solution {
    public void solveSudoku(char[][] board) {
        solveSudoku(board, 0, 0);
    }

    public static boolean solveSudoku(char[][] board, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            return true;
        }
        if (board[row][col] != '.') {
            return solveSudoku(board, row, col + 1);
        } else {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isPossible(board, row, col, ch)) {
                    board[row][col] = ch;
                    if (solveSudoku(board, row, col + 1)) {
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public static boolean isPossible(char[][] board, int row, int col, char ch) {
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == ch) {
                return false;
            }
        }
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == ch) {
                return false;
            }
        }
        int subgridStartRow = (row / 3) * 3;
        int subgridStartCol = (col / 3) * 3;
        for (int r = subgridStartRow; r < subgridStartRow + 3; r++) {
            for (int c = subgridStartCol; c < subgridStartCol + 3; c++) {
                if (board[r][c] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}
