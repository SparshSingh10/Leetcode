class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (num <= n * n) {
            for (int col = minCol; col <= maxCol; col++) {
                matrix[minRow][col] = num++;
            }
            minRow++;

            for (int row = minRow; row <= maxRow; row++) {
                matrix[row][maxCol] = num++;
            }
            maxCol--;

            for (int col = maxCol; col >= minCol; col--) {
                matrix[maxRow][col] = num++;
            }
            maxRow--;

            for (int row = maxRow; row >= minRow; row--) {
                matrix[row][minCol] = num++;
            }
            minCol++;
        }

        return matrix;
    }
}
