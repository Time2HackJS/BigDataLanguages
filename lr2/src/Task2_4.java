import java.util.Random;

// 4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки. 

public class Task2_4 {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[8][8];
        Random ran = new Random();

        // Заполняем матрицу случайными элементами от -5 до 5
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = ran.nextInt(11) - 6;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 7; j++) {
                if (matrix[i][j - 1] > 0 && matrix[i][j + 1] > 0) sum += matrix[i][j];
            }
        }

        System.out.println(sum);
    }
}
