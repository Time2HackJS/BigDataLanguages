import java.util.Arrays;
import java.util.Random;

public class Matrix1 {
    private Integer[][] value;

    public Matrix1() {
        this.value = new Integer[8][8];
    }

    public Matrix1(Integer[][] value) {
        this.value = value;
    }

    public Matrix1(int size, int bound, int bias) {
        Integer[][] value = new Integer[size][size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                value[i][j] = rand.nextInt(bound) + bias;
            }
        }

        this.value = value;
    }

    public Integer[][] getValue() {
        return this.value;
    }

    public void add(Matrix1 matrix) throws Exception {
        int size = matrix.getValue().length;

        if (this.value == null) throw new NullPointerException();
        if (matrix.getValue()[0].length != this.value[0].length) throw new Exception("Размерность матриц не одинакова");

        if (size == this.value.length) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    this.value[i][j] += matrix.getValue()[i][j];
                }
            }
        }
        else System.out.println("Matrix sizes are not equal");
    } 

    public void sub(Matrix1 matrix) throws Exception {
        int size = matrix.getValue().length;

        if (this.value == null) throw new NullPointerException();
        if (matrix.getValue()[0].length != this.value[0].length) throw new Exception("Размерность матриц не одинакова");

        if (size == this.value.length) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    this.value[i][j] -= matrix.getValue()[i][j];
                }
            }
        }
        else System.out.println("Matrix sizes are not equal");
    } 

    public void mul(Matrix1 matrix) throws Exception {
        int size = matrix.getValue().length;
        Integer[][] newMatrix = new Integer[size][size];

        if (this.value == null) throw new NullPointerException();
        if (matrix.getValue()[0].length != this.value[0].length) throw new Exception("Размерность матриц не одинакова");

        if (size == this.value.length) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int sum = 0;
                    for (int k = 0; k < matrix.getValue().length; k++) {
                        sum += this.value[i][k] * matrix.getValue()[k][j];
                    }
                    newMatrix[i][j] = sum;
                }
            }
        }
        else System.out.println("Matrix sizes are not equal");

        this.value = newMatrix;
    } 

    public Integer findNorm(int normNumber) {
        int size = this.value.length;

        Integer[] normArray = new Integer[size];

        if (this.value == null) throw new NullPointerException();

        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += this.value[i][j];
            }
            normArray[i] = sum;
        }

        Arrays.sort(normArray);
        System.out.println(normArray);

        if (normNumber < size) return normArray[size - normNumber - 1];
        else throw new ArrayIndexOutOfBoundsException();
    }

    public static Matrix1 maxNorm(int normNumber, Matrix1 matrix1, Matrix1 matrix2) {
        int m1Norm = matrix1.findNorm(normNumber);
        int m2Norm = matrix2.findNorm(normNumber);

        return m1Norm > m2Norm ? matrix1 : matrix2;
    }
}