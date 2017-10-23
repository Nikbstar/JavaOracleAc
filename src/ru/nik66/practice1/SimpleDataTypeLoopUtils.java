//  Практическое задание 1 - примитивы, классы, методы, поля, управляющие конструкции.
package ru.nik66.practice1;

public class SimpleDataTypeLoopUtils {

    // 1) Создайте класс, в котором присутствуют переменные класса всех примитивных типов.
    // Выведите на экран значение полей класса без предварительной инициализации.
    // Повторите то же самое для локальных переменных.
    public static boolean bool;
    public static char c;
    public static byte b;
    public static short s;
    public static int i;
    public static long l;
    public static float f;
    public static double d;

    public static void printingTypes() {
        System.out.println(bool);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        boolean bool = false;
        char c = 0;
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        float f = 0;
        double d = 0;
        System.out.println(bool);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }

    // 2) Создайте несколько переменных типа float. Присвойте этим переменным значения:
    // 1.;
    // 1;
    // 0x1;
    // 0b1;
    // 1.0e1;
    // 01;
    public static void floatType() {
        float f1 = 1.f;
        float f2 = 1;
        float f3 = 0x1;
        float f4 = 0b1;
        float f5 = 1.0e1f;
        float f6 = 01;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
    }

    // 3) Создайте переменную типа short. Инициализируйте ее результатом выполнения следующих операций:
    // - суммой двух целых чисел;
    // - суммой целого и дробного числа;
    // - суммой значений переменных типов float и int;
    // - суммой значений переменных типа byte + short;
    // - суммой значений переменных типа float + double;
    public static void shortType() {
        short s;
        s = 1 + 2;
        System.out.println(s);
        s = 1 + (short) 2.;
        System.out.println(s);
        float f = 1;
        int i = 2;
        s = (short) (f + i);
        System.out.println(s);
        byte b = 1;
        short s1 = 2;
        s = (short) (b + s1);
        System.out.println(s);
        double d = 2;
        s = (short) (f + d);
        System.out.println(s);
    }

    //  4) Заданы значения 2-х катетов и гипотенузы треугольника. Проверить является ли данный
    // треугольник прямоугольным. Вычисления записать выражением, состоящим из одной строки
    // (испольуя оператор "?:").
    public static void checkRightTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            if (c > a && c > b && a + b > c) {
                System.out.print((a * a + b * b == c * c) ? "Right triangle!" : "Not right triangle!");
            } else if (a > b && a > c && b + c > a) {
                System.out.print((b * b + c * c == a * a) ? "Right triangle!" : "Not right triangle!");
            } else if (b > c && b > a && c + a > b) {
                System.out.print((c * c + a * a == b * b) ? "Right triangle!" : "Not right triangle!");
            } else {
                System.out.println("Not triangle!");
            }
        } else {
            System.out.println("Incorrect input!");
        }
    }
    // 5) Подсчитать сумму целых чисел от 1 до 20.
    public static void oneToTwentySumm() {
        int i = 1;
        int result = 0;
        do {
            result += i;
            i++;
        } while (i <= 20);
        System.out.println(result);
    }

    // 6) Подсчитать сумму четных целых чисел от 1 до 20.
    public static void oneToTwentyOddSumm() {
        int i = 1;
        int result = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                result += i;
            }
            i++;
        }
        System.out.println(result);
    }

    // 7) Подсчитать сумму простых чисел в диапазоне от 1 до 20.
    public static void oneToTwentyPrimeSumm() {
        int result = 0;
        for (int i = 1; i <=20; i++) {
            if (checkPrime(i)) {
                result += i;
            }
        }
        System.out.println(result);
    }

    public static boolean checkPrime(int num) {
        boolean result = true;
        if (num == 1) {
            result = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    // 8) Имея три переменные типа int a, b, c выведите на экран true,
    // если сумма значений двух любых из этих переменных равна значению третей.
    public static void aPlusBEqualsC(int a, int b, int c) {
        if (a + b == c || b + c == a || c + a == b) {
            System.out.println("true");
        }
    }

    // 9) Две переменные типа int, имеют положительные значения
    // int a - начало диапазона, int b - конец диапазона, a>b.
    // Вычислить среднее значение чисел в заданном диапазоне.
    // Для решения заданий 5-9 используйте различные циклы (for/while/do-while).
    public static double meanValue(int a, int b) {
        double result = 0;
        if (a < 0 || b < 0 || a <= b) {
            System.out.println("Incorrect input!");
            result = -1;
        } else {
            for (int i = a; i >= b; i--) {
                result += i;
            }
            result /= (a - b + 1);
        }
        return result;
    }

}
