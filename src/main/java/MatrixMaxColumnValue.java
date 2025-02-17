// Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и вывести наибольшую из них
public class MatrixMaxColumnValue {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = value++;
            }
        }
        countMaxColumnValue(matrix);
    }

    static void countMaxColumnValue(int[][] matrix) {
        int columnSum = 0;
        int maxColumnSum = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            columnSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                columnSum = columnSum + matrix[i][j];
            }
        }
        if (columnSum > maxColumnSum) {
            maxColumnSum = columnSum;
        }
        System.out.println(maxColumnSum);
    }
}
