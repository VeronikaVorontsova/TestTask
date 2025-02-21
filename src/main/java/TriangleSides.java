/* Пользователь вводит в консоли длины сторон треугольника (три числа),
выводим сообщение, является ли треугольник равнобедренным, равносторонним или разносторонним.
 */

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int side1 = scr.nextInt();
        int side2 = scr.nextInt();
        int side3 = scr.nextInt();

        compareTriangleSides(side1, side2, side3);

    }

    private static void compareTriangleSides(int side1, int side2, int side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1) {
            System.out.println("Такого треугольника быть не может");
            return;
        }
        if (side1 == side2 && side2 == side3) {
            System.out.println("Треугольник равносторонний");
        }
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Треугольник равнобедренный");
        }
        if (side1 != side2 && side2 != side3 && side1 != side3) {
           System.out.println("Треугольник разносторонний");
            }
        }
    }

