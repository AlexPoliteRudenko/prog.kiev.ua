import java.util.Scanner;
/**
 * Написать программу переводящую количество дней в номера года, месяца, дня месяца.
 * Предполагается, что год состоит из 360 дней, месяц из 30 дней.
 * Input: days.
 * Ouput: year, month, day.
 */
public class DateCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int days = in.nextInt(); // Any positive number
        int year = (days - 1) / 360 + 1;
        int month = ((days - 1) % 360) / 30 + 1;
        int day = ((days - 1) % 360) % 30 + 1;
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
    }
}
