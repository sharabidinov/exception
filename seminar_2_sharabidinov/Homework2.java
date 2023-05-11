package seminar_2_sharabidinov;

/*2. Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

    1 Дан следующий код, исправьте его там, где требуется
      (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

    2 Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
      Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/

public class Homework2 {

    public static void main(String[] args) {
//        someMethod(); // < 1 подзадача
//        2 подзадача |
//                    |
//                   \*/
//                    .
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[1] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так :(");
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }


    public static void someMethod() {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7};
//            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вызод за пределы массива " + e);
        }

    }
}
