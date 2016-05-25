import java.util.Scanner;
/**
 * Task 4* (IdToToyNameConverter)
 * Определение названия детской игрушки по ее идентификатору. Если данной
 * игрушки нет, бросить исключение IllegalArgumentException. Реализовать с помощью if-
 * else цепочки.
 * Виды игрушек:
 * 0 – Car.
 * 1 – Lego.
 * 2 – Doll.
 * 3 – Puzzle.
 */
public class IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите идентификатор id = ");
        int id = in.nextInt();
        String getToyName;
        if (id == 0)
            getToyName = "Car.";
        else if (id == 1)
            getToyName = "Lego.";
        else if (id == 2)
            getToyName = "Doll.";
        else if (id == 3)
            getToyName = "Puzzle.";
        else {
            throw new IllegalArgumentException("Указанный id не входит в диапазон значений 0..3");
        }
        System.out.println(getToyName);
    }
}
