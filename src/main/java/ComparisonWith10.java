/*Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение “Число больше десяти”,
 если меньше – “Число меньше десяти” */

import java.util.Scanner;

public class ComparisonWith10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int inputInt = scr.nextInt();
        isMoreThan10(inputInt);
    }

    private static void isMoreThan10(int inputInt) {
        if (inputInt > 10) {
            System.out.println("Число больше десяти");
        } else if (inputInt < 10) {
            System.out.println("Число меньше десяти");
        } else {
            System.out.println("Числа равны");
        }
    }
}
