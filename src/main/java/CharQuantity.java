// На ввод подается слово и буква. Определить, сколько заданных букв в введенном слове, не учитывая регистр.
import  java.util.Scanner;
public class CharQuantity {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = scr.nextLine().toLowerCase();
        System.out.println("Введите символ");
        char letter = scr.nextLine().toLowerCase().charAt(0);

        countLetters(word, letter);
    }
    static void countLetters(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==letter) {
                count++;
            }
        }
        System.out.println(count);
    }
}
