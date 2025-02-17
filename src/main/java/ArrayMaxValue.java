//Дан массив с целыми числами. Вывести в консоль наибольшее из них
public class ArrayMaxValue {
    public static void main(String[] args) {
        int[] ints = new int[]{1, -8, -988, 7, 5, 0, 100, -3, 0, 7, 104, 42, -21, 8};
        countArrayMaxValue(ints);
    }

    static void countArrayMaxValue(int[] ints) {
        int max = 0;
        for (int i = 0; i < ints.length; i++) {

            if (ints[i] > max) {
                max = ints[i];
            }
        }
        System.out.println(max);

    }
}
