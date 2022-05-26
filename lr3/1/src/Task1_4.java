import java.util.Arrays;
import java.util.Random;

/*
    4.  Определить класс Матрица размерности (n x n). 
        Класс должен содержать несколько конструкторов. 
        Реализовать методы для сложения, вычитания, умножения матриц. 
        Объявить массив объектов. 
        Создать методы, вычисляющие первую и вторую нормы матрицы.
        Определить, какая из матриц имеет наименьшую первую и вторую нормы. 
*/

public class Task1_4 {

    public static class Matrix {
        private Integer[][] value;

        public Matrix(Integer[][] value) {
            this.value = value;
        }

        public Matrix(int size, int bound, int bias) {
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

        public void add(Matrix matrix) {
            int size = matrix.getValue().length;

            if (size == this.value.length) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        this.value[i][j] += matrix.getValue()[i][j];
                    }
                }
            }
            else System.out.println("Matrix sizes are not equal");
        } 

        public void sub(Matrix matrix) {
            int size = matrix.getValue().length;

            if (size == this.value.length) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        this.value[i][j] -= matrix.getValue()[i][j];
                    }
                }
            }
            else System.out.println("Matrix sizes are not equal");
        } 

        public void mul(Matrix matrix) {
            int size = matrix.getValue().length;
            Integer[][] newMatrix = new Integer[size][size];

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
            else {
                System.out.println("Not correct norm number");
                return null;
            }
        }

        public static Matrix maxNorm(int normNumber, Matrix matrix1, Matrix matrix2) {
            int m1Norm = matrix1.findNorm(normNumber);
            int m2Norm = matrix2.findNorm(normNumber);

            return m1Norm > m2Norm ? matrix1 : matrix2;
        }
    }

    public static void main(String[] args) {
        Matrix[] matrixes = new Matrix[2];

        matrixes[0] = new Matrix(8, 11, 6);
        matrixes[1] = new Matrix(8, 11, 6);

        Arrays.stream(matrixes[0].getValue()).map(Arrays::toString).forEach(System.out::println);
        Arrays.stream(matrixes[1].getValue()).map(Arrays::toString).forEach(System.out::println);

        System.out.println(matrixes[0].findNorm(0));
        System.out.println(matrixes[1].findNorm(0));
        System.out.println(Matrix.maxNorm(0, matrixes[0], matrixes[2]));
    }
}