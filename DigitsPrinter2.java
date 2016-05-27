import java.util.Scanner;
/**
 * Task 1** (DigitsPrinter)
 * Вывод в консоль цифр целого числа. Если число отрицательное, вывести знак «-».
 * Использование преобразования числа в строку запрещено.
 */
public class DigitsPrinter2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int digits = 0;
        int i;
        do{
            digits++;
            i = Math.abs(n) / (int)Math.pow(10, digits);
        } while (i > 0);
        if (n > 0){
            for (int x = digits; x > 0; x--) {
                System.out.print((Math.abs(n) % (int) Math.pow(10, x) / (int) Math.pow(10, x - 1)) + " ");
            }
        }
        else{
            System.out.print("- ");
            for (int x = digits; x > 0; x--) {
                System.out.print((Math.abs(n) % (int) Math.pow(10, x) / (int) Math.pow(10, x - 1)) + " ");
            }
        }
    }
}
