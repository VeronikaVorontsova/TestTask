//Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или
//нечетное

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input1 = scr.nextInt();
        countEvenOdd(input1);
    }

    private static void countEvenOdd(int input1) {
        if (input1 % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}
