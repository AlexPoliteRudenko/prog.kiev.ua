import java.util.Scanner;
/**
 * Task 5* (ToyNameToIdConverter)
 * Определение идентификатора детской игрушки по ее названию (задача, обратная к
 * Task 4). Если данной игрушки нет, бросить исключение IllegalArgumentException.
 * Реализовать с помощью switch-case.
 * Виды игрушек:
 * 0 – Car.
 * 1 – Lego.
 * 2 – Doll.
 * 3 – Puzzle.
 */
public class ToyNameToIdConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название игрушки: ");
        String name = in.next();
        int getToyId;
        switch (name){
            case "Car": getToyId = 0;
                break;
            case "Lego": getToyId = 1;
                break;
            case "Doll": getToyId = 2;
                break;
            case "Puzzle": getToyId = 3;
                break;
            default: throw new IllegalArgumentException();
        }
        System.out.println("id = " + getToyId);
    }
}
