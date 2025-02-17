/*Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль количество
отрицательных и положительных чисел
 */

import java.util.Scanner;

public class ComparisonOfFourInputs {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input1 = scr.nextInt();
        int input2 = scr.nextInt();
        int input3 = scr.nextInt();
        int input4 = scr.nextInt();

        compareFourInputs(input1, input2, input3, input4);
        scr.close();
    }

    public static void compareFourInputs(int input1, int input2, int input3, int input4) {
        int negativeCount = 0;
        int zeroCount = 0;

        if (input1 < 0) {
            negativeCount++;
        } else if (input1 == 0) {
            zeroCount++;
        }
        if (input2 < 0) {
            negativeCount++;
        } else if (input2 == 0) {
            zeroCount++;
        }
        if (input3 < 0) {
            negativeCount++;
        } else if (input3 == 0) {
            zeroCount++;
        }
        if (input4 < 0) {
            negativeCount++;
        } else if (input4 == 0) {
            zeroCount++;
        }
        System.out.println("Количество отрицательных чисел: " + negativeCount + ". " + "\n" + "Количество положительных чисел: " + (4 - negativeCount - zeroCount) + ". " +
                "" + "\n" + "Количество нолей: " + zeroCount + ".");

    }
}
