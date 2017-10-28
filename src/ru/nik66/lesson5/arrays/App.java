package ru.nik66.lesson5.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        // Первый способ объявления массива
        int [] intArray = new int[5];
        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));
        intArray[2] = 5;
        System.out.println(Arrays.toString(intArray));

        // Второй способ объявления и инициализации массива
        int [] ints = {3, 5, 6, 8, 9, 5};
        System.out.println(Arrays.toString(ints));

        // Третий способ
        int [] ints1;
        ints1 = new int[]{4, 32, 5, 6, 45};
        System.out.println(Arrays.toString(ints1));

        // Перебор массива
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        // Foreach
        for (int int1: ints1) {
            System.out.print(int1 + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(args));

        // Массив массивов
        int[][] array = {{1, 4, 3}, {4, 4}, null, {4, 6, 1, 6, 4, 3, 3}, {4, 4, 4}};
        System.out.println(Arrays.deepToString(array));
        array[4][1] = 0;
        System.out.println(Arrays.deepToString(array));
        array[4] = new int[]{5, 5, 5, 5};
        System.out.println(Arrays.deepToString(array));

        // Перебор двумерного массива
        for (int[] ints2 : array) {
            if (ints2 == null) {
                continue;
            }
            for (int i : ints2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // Массив чаров в строку
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(new String(chars));
    }

}
