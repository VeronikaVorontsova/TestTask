// Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами

public class ArrayEvenIndexSum {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 5, 2, 100, 7, 3, 6};
        countEvenIndexArrayElements(ints);
    }

    static void countEvenIndexArrayElements(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {

            if (i % 2 == 0) {
                sum = sum + ints[i];
            }
        }
        System.out.println(sum);

    }
}
