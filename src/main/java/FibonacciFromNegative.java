// Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
//индексом х

import java.util.Scanner;

public class FibonacciFromNegative {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scr.nextInt();

        int answer = countFibonnacciNegative(input);
        System.out.println(answer);
    }

    private static int countFibonnacciNegative(int input) {
        if (input == 0) return 0;
        if (input == -1 || input == 1) return 1;
        int firstFibonacci = 0;
        int secondFibonacci = 1;

        for (int i = 2; i <= Math.abs(input); i++) {
            int newFibonacci = firstFibonacci + secondFibonacci;
            firstFibonacci = secondFibonacci;
            secondFibonacci = newFibonacci;
        }
        if (input < 0 && input % 2 == 0) {
            return -secondFibonacci;
        } else {
            return secondFibonacci;
        }
    }
}
