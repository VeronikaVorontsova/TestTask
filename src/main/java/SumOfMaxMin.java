//Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
//наибольшего и наименьшего из них

import java.util.Scanner;

public class SumOfMaxMin {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input1 = scr.nextInt();
        int input2 = scr.nextInt();
        int input3 = scr.nextInt();
        countMaxMin(input1, input2, input3);
    }

    private static void countMaxMin(int input1, int input2, int input3) {
        int max = 0;
        int min = 0;
        if (input1 > input2) {
            max = input1;
            min = input2;
        } else {
            max = input2;
            min = input1;
        }
        if (input3 > max) {
            max = input3;
        } else if (input3 < min) {
            min = input3;
        }
        System.out.println("Сумма наибольшего и наименьшего числа: " + (max + min));
    }
}
