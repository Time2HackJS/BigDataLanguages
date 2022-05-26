import java.util.Arrays;
import java.util.Random;

public class Task1_5 {

    public static class Matrix {
        public Integer[][] value;

        public Matrix(Integer[][] value) {
            this.value = value;
        }

        public Matrix(int n, int m, int bound, int bias) {
            Integer[][] value = new Integer[n][m];
            Random rand = new Random();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    value[i][j] = rand.nextInt(bound) + bias;
                }
            }

            this.value = value;
        }

        static public Matrix swapMaxRows(Matrix matrix, int column) {
            int maxElem = -1000;
            int minElem = 1000;

            int maxElemRow = 0;
            int minElemRow = 0;

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

        public static void sqrElem(Matrix[] matrixes, int elem) {
            matrixes[elem].sqr();
        }
    }

    public static void main(String[] args) {
        Matrix[] matrixes = new Matrix[2];

        matrixes[0] = new Matrix(5, 6, 11, -6);
        matrixes[1] = new Matrix(5, 6, 11, -6);

        System.out.println("Swapping rows:");
        Arrays.stream(matrixes[0].value).map(Arrays::toString).forEach(System.out::println);
        System.out.println();
        Matrix.swapMaxRows(matrixes[0], 3);
        Arrays.stream(matrixes[0].value).map(Arrays::toString).forEach(System.out::println);

        System.out.println("Sqr matrix:");
        Arrays.stream(matrixes[1].value).map(Arrays::toString).forEach(System.out::println);
        System.out.println();
        Matrix.sqrElem(matrixes, 1);
        Arrays.stream(matrixes[1].value).map(Arrays::toString).forEach(System.out::println);
    }
}
