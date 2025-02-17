//Дан массив с целыми числами. Вывести в консоль количество положительных и отрицательных чисел в нем

public class ArrayNegativePositiveQuantity {
    public static void main(String[] args) {
        int[] ints = new int[]{1, -8, 5, 0, -3, 0, 7, 42, -21};
        countPositiveNegativeArray(ints);
    }

    private static void countPositiveNegativeArray(int[] ints) {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                countPositive++;
            } else if (ints[i] < 0) {
                countNegative++;
            } else if (ints[i] == 0) {
                countZero++;
            }
        }

        System.out.println("Количество положительных чисел в массиве: " + countPositive);
        System.out.println("Количество отицательных чисел в массиве: " + countNegative);
        System.out.println("Количество нулей в массиве: " + countZero);
    }

}