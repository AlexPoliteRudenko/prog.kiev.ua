/**
 * Парсинг строки возраста (в строке представлено число типа int). Можно
 * пользоваться стандартными функциями. Если входная строка является числом, что не
 * соответствует диапазону 1..120, бросить исключение IllegalArgumentException.
 */
public class AgeParser {
    public static void main(String[] args) {
        String ageString = "25";
        int parseAge = Integer.parseInt(ageString);
        if (parseAge > 0 & parseAge < 121){
            System.out.println(parseAge);
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
