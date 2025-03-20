// Напиши метод, который принимает массив целых чисел и возвращает сумму всех элементов.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValuesSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter array element #" + (i + 1));
            int value = scr.nextInt();
            nums[i] = value;
        }
        System.out.println(Arrays.toString(nums));
        countArraySum(nums);
        scr.close();
    }

    static void countArraySum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("Array elements sum: " + sum);
    }
}
