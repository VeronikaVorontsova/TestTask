/* Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение:
“Денег не хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше –
 “Ваша сдача: [сумма сдачи]”
 */

import java.util.Scanner;

public class ShopCalculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Меню:" + "\n" + "1. Курица - 8 руб " + "\n"
                + "2. Говядина - 15 руб" + "\n"
                + "3. Свинина - 12 руб" + "\n"
                + "Выберете номер товара: ");
        int chooseFromMenu = scr.nextInt();

        if (chooseFromMenu > 3 || chooseFromMenu < 1) {
            System.out.println("Такого товара не существует");
            System.exit(0);
        }
        System.out.println("Введите сумму оплаты: ");

        double enterSum = scr.nextDouble();
        countReceipt(chooseFromMenu, enterSum);
    }

    private static void countReceipt(int chooseFromMenu, double enterSum) {
        double price=0;
         switch (chooseFromMenu) {
             case 1:
                 price =8;
                 break;
             case 2:
                 price=15;
                 break;
             case 3:
                 price=12;
                 break;
             default:
                 break;
        };

        if (enterSum < price) {
            System.out.println("Денег не хватает!");
        } else if (enterSum > price) {
            System.out.println("Ваша сдача: " + (enterSum - price));
        } else {
            System.out.println("Спасибо за покупку!");
        }
    }
}
