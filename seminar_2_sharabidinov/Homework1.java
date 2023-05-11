package seminar_2_sharabidinov;

import java.util.Scanner;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.*/

public class Homework1 {
    public static void main(String[] args) {
        float number = readFloatFromConsole();
        System.out.println("Вы ввели число: " + number);
    }

    private static float readFloatFromConsole() {
        Scanner scanner = new Scanner(System.in);
        float number;
        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                number = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректное значение. Попробуйте еще раз.");
            }
        }
        return number;
    }
}
