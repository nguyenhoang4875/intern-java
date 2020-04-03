package array;

public class Exer13 {

    public int[][] reduceMatrix(int[][] matrix, int row, int col) {
        if (row < 0 || row > matrix.length || col < 0 || col > matrix[0].length) {
            return matrix;
        }
        int[][] result = new int[matrix.length - 1][matrix[0].length - 1];
        int m;

        for (int i = 0; i < result.length; i++) {
            m = i < row ? i : i + 1;
            int n;

            for (int j = 0; j < result[0].length; j++) {
                n = j < col ? j : j + 1;
                result[i][j] = matrix[m][n];
            }
        }
        return result;
    }
}
