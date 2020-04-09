package array;

public class Exer14 {

    public int determinant(int[][] matrix) {
        if (matrix.length == 1) {
            return (matrix[0][0]);
        }
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int[][] smaller = new int[matrix.length - 1][matrix.length - 1];

            for (int row = 1; row < matrix.length; row++) {

                for (int col = 0; col < matrix.length; col++) {
                    if (col < i) {
                        smaller[row - 1][col] = matrix[row][col];
                    } else if (col > i) {
                        smaller[row - 1][col - 1] = matrix[row][col];
                    }
                }
            }
            if (i % 2 == 0) {
                sum += matrix[0][i] * (determinant(smaller));
            } else {
                sum -= matrix[0][i] * (determinant(smaller));

            }
        }
        return sum;
    }
}
