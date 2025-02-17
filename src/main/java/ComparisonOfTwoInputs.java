/* Пользователь вводит в консоли два числа, выводим сообщение “первое число больше/меньше, чем второе”
в зависимости от результата их сравнения */

import java.util.Scanner;

public class ComparisonOfTwoInputs {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input1 = scr.nextInt();
        int input2 = scr.nextInt();
        compareInputs(input1, input2);
    }

    private static void compareInputs(int input1, int input2) {
        if (input1 > input2) {
            System.out.println("первое число больше, чем второе");
        } else if (input2 > input1) {
            System.out.println("первое число меньше, чем второе");
        } else {
            System.out.println("Числа равны");
        }
    }
}
