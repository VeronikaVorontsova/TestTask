//Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х

import java.util.Scanner;

public class NegativeInputCycle {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите отрицательное число:");
        int negativeInput = scr.nextInt();
        countEvenNegative(negativeInput);
    }

    private static void countEvenNegative(int negativeInput) {
        int positiveInput = Math.abs(negativeInput);
        for (int i = 0; i <= positiveInput; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
