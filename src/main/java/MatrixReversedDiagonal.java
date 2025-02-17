// Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][10] до [10][0]

public class MatrixReversedDiagonal {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int value = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = value++;
            }
        }
        matrixReversedDiagonalCount(matrix);
    }

    static void matrixReversedDiagonalCount(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][(matrix.length - 1) - i] + " ");
        }
    }
}
