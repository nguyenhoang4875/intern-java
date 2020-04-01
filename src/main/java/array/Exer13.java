package array;

public class Exer13 {

    public int[][] reduceMatrix(int[][] matrix, int row, int col) {
        if (row < 0 || row > matrix.length || col < 0 || col > matrix[0].length) {
            return matrix;
        }
        int[][] result = new int[matrix.length - 1][matrix[0].length - 1];

        for (int i = 0; i < matrix.length - 1; i++) {

            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (i < row) {
                    if (j < col) {
                        result[i][j] = matrix[i][j];
                    } else {
                        result[i][j] = matrix[i][j + 1];
                    }
                } else {
                    if (j < col) {
                        result[i][j] = matrix[i + 1][j];
                    } else {

                        result[i][j] = matrix[i + 1][j + 1];
                    }
                }
            }
        }
        return result;
    }
}
