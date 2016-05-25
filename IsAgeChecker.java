import java.util.Scanner;
/**
 * Task 2* (IsAgeChecker)
 * Определение корректности заданного возраста. Возраст может принимать значения
 * в диапазоне 1..120.
 */
public class IsAgeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст = ");
        int age = in.nextInt();
        boolean isAge = age > 0 & age < 121;
        System.out.println(isAge);
    }
}
