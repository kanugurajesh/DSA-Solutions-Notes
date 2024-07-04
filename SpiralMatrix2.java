class Solution {

    // Fill the matrix with sequential numbers
    public void fillMatrix(int[][] matrix, int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
    }

    // Generate the matrix and then create its spiral version
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int[][] newMatrix = new int[n][n];
        fillMatrix(matrix, n);
        return printSpiralMatrix(matrix, n, newMatrix);
    }

    // Convert the matrix into its spiral form
    public int[][] printSpiralMatrix(int[][] matrix, int n, int[][] newMatrix) {

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int count = 1;

        while (left <= right && top <= bottom) {

            // Print top row
            for (int i = left; i <= right; i++) {
                newMatrix[top][i] = count++;
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                newMatrix[i][right] = count++;
            }
            right--;

            // Print bottom row if still within bounds
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    newMatrix[bottom][i] = count++;
                }
                bottom--;
            }

            // Print left column if still within bounds
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    newMatrix[i][left] = count++;
                }
                left++;
            }

        }

        return newMatrix;

    }

}
