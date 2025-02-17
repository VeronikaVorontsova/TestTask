//Пользователь вводит в консоли три числа, выводим самое большое из них.

import java.util.Scanner;

public class MaxOfThreeInts {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input1 = scr.nextInt();
        int input2 = scr.nextInt();
        int input3 = scr.nextInt();
        countMax(input1, input2, input3);
    }

    private static void countMax(int input1, int input2, int input3) {
        int max = 0;
        if (input1 > input2) {
            max = input1;
        } else max = input2;
        if (input3 > max) {
            max = input3;
        }
        System.out.println("Максимальное число из введённых: " + max);
    }
}
