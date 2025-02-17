//Пользователь вводит число. Выводим в консоль факториал этого числа

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число:");
        int input = scr.nextInt();
        countFactorial(input);
    }

    private static void countFactorial(int input) {
        int result = 1;
        if (input < 0) {
            System.out.println("Отрицательных факториалов не существует");
            System.exit(0);
        }
        if (input == 1 || input == 0) {
            System.out.println(1);
        }
        for (int i = 1; i <= input; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
