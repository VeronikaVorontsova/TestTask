//Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные
//значения)

public class ArrayEvenValueSum {
    public static void main(String[] args) {
        int[] ints = new int[]{1, -8, 7, 5, 0, 100, -3, 0, 7, 42, -21, 8};
        countEvenArrayElements(ints);
    }

    static void countEvenArrayElements(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {

            if (ints[i] % 2 == 0) {
                sum = sum + ints[i];
            }
        }
        System.out.println(sum);

    }
}
