import java.util.Scanner;
/**
 * Написать программу находящую среднее арифметическое двух целых чисел типа int.
 * Учитывать возможность переполнения. Приведение типов запрещено.
 * Примеры:
 * 1. a = 5, b = 9
 * Вывод:
 * avg = 7
 */
public class AvarageCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a = ");
        int a = in.nextInt();
        System.out.print("Введите число b = ");
        int b = in.nextInt();
        int avg = a / 2 + b / 2 + (a % 2 + b % 2) / 2;
        System.out.println("Среднее арифметическое = " + avg);
    }
}
