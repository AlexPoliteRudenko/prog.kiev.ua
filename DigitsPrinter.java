import java.util.Scanner;
import static java.lang.Math.pow;
/**
 * Написать программу выводящую в консоль младшие 5 цифр положительного десятичного числа.
 * Примеры:
 * 1. n = 13569
 * Вывод:
 * 1
 * 3
 * 5
 * 6
 * 9
 */
public class DigitsPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int DigitsNumber = 5;
            for (int i = DigitsNumber; i > 0; i--) {
                System.out.println(n % (int) Math.pow(10, i) / (int) Math.pow(10, i - 1));
            }
    }
}
