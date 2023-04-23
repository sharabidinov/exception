package seminar_1_sharabidinov;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        Homework1 example = new Homework1();
        example.methodOne(); // возвращает ArrayIndexOutOfBoundsException
        example.methodTwo(); // возвращает ArithmeticException
        example.methodThree(); // возвращает NullPointerException
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {4, 5, 6};
        int[] result = example.subtractArrays(arrayOne, arrayTwo); // Если длины массивов не равны, метод выбрасывает исключение RuntimeException, но в нашем случае вернёт -3, -3, -3
        System.out.println(Arrays.toString(result));
    }

    public void methodOne() {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }

    public void methodTwo() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        }
    }

    public void methodThree() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }

    public int[] subtractArrays(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne.length != arrayTwo.length) {
            throw new RuntimeException("Arrays must have equal length");
        }
        int[] result = new int[arrayOne.length];
        for (int i = 0; i < arrayOne.length; i++) {
            result[i] = arrayOne[i] - arrayTwo[i];
        }
        return result;
    }
}
