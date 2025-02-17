// Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
//один символ)

import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String input = scr.nextLine();
        int stringLength = input.length();
        int charIndex = 0;

        while (charIndex <= stringLength - 1) {
            System.out.println(input.charAt(charIndex));
            charIndex++;
        }
    }
}
