import java.util.Random;

public class Matrix2 {
    public Integer[][] value;

    public Matrix2(Integer[][] value) {
        this.value = value;
    }

    public Matrix2(int n, int m, int bound, int bias) throws Exception {
        Integer[][] value = new Integer[n][m];
        Random rand = new Random();

        if (n == 0 || m == 0) throw new Exception("Размерность матрицы не может быть равна нулю");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                value[i][j] = rand.nextInt(bound) + bias;
            }
        }

        this.value = value;
    }

    static public Matrix2 swapMaxRows(Matrix2 matrix, int column) {
        int maxElem = -1000;
        int minElem = 1000;

        int maxElemRow = 0;
        int minElemRow = 0;

        if (matrix.value.length > column + 1) throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < matrix.value.length; i++) {
            int val = matrix.value[column][i];

            if (val > maxElem) {
                maxElem = val;
                maxElemRow = i;
            }

            if (val < minElem) {
                minElem = val;
                minElemRow = i;
            }
        }

        Integer[] maxRow = matrix.value[maxElemRow];
        matrix.value[maxElemRow] = matrix.value[minElemRow];
        matrix.value[minElemRow] = maxRow;

        return matrix;
    }

    public void sqr() {
        int n = this.value.length;
        int m = this.value[0].length;

        Integer[][] newMatrix = new Integer[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += this.value[i][k] * this.value[k][j];
                }
                newMatrix[i][j] = sum;
            }
        }

        this.value = newMatrix;
    }

    public static void sqrElem(Matrix2[] matrixes, int elem) {
        matrixes[elem].sqr();
    }
}