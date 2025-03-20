//Напиши метод, который принимает массив целых чисел и возвращает максимальное число из массива.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxValueInput {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter array value #" + (i + 1));
            arr[i] = scr.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int maxArrayValue = countMaxArrayValue(arr);
        System.out.println("Max value of the array is " + maxArrayValue);
        scr.close();
    }

    public static int countMaxArrayValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = array[i];
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}
