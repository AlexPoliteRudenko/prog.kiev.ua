import java.util.Scanner;
/**
 * Task 1* (MinMaxCalculator)
 * Нахождение минимума/максимума двух чисел.
 * int max(int a, int b)
 * int min(int a, int b)
 */
public class MinMaxCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а = ");
        int a = in.nextInt();
        System.out.print("Введите число b = ");
        int b = in.nextInt();
        int max, min;
        if (a > b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
