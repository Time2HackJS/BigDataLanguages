import java.util.Arrays;
import java.util.Random;

// 5. Транспонировать квадратную матрицу. 

public class Task2_5 {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[8][8];
        Integer[][] tMatrix = new Integer[8][8];
        Random ran = new Random();

        // Заполняем матрицу случайными элементами от -5 до 5
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = ran.nextInt(11) - 5;
                tMatrix[j][i] = matrix[i][j];
            }
        }

        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
        Arrays.stream(tMatrix).map(Arrays::toString).forEach(System.out::println);
    }
}
