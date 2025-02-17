//Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
//таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести соответствующее сообщение.

import java.util.Arrays;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] ints = new int[]{1, -8, 7, 5, 0, 0, 7, 8, 0};
        countDuplicateArrayElements(ints);
    }

    static void countDuplicateArrayElements(int[] ints) {
        int mostFrequent = ints[0];
        int maxCounter = 0;
        int counter = 0;
        Arrays.sort(ints);
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] == ints[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                mostFrequent = ints[i];
            }
        }
        System.out.println("Наиболее часто встречающееся число в массиве: " + mostFrequent);


    }
}
