package ru.nik66.lesson3;

public class App {

    public static final int WORK_DAYS_NORM = 22;
    public static String name = "Kolya";

    public static void main(String[] args) {
        // Логическое И
        System.out.println((2 < 3) && (8 < 6));
        // Короткая схема. Сработает только method1 (быстрее работает)
        System.out.println(method1(false) && method2(true));
        // Длинная схема. Сработают оба метода (если нужны расчеты во втором методе)
        System.out.println(method1(false) & method2(true));
        // Можно использовать только короткую схему
        if (name != null && name.length() > 2) {
            System.out.println("Name is " + name);
        }

        System.out.println("true && true -> " + (true && true));
        // Исключающее или (true если разные значения)
        System.out.println("true ^ true -> " + (true ^ true));
        System.out.println("true ^ false -> " + (true ^ false));
        System.out.println("false ^ false -> " + (false ^ false));

        // switch
        int dayNumber = 1;
        final int tuesday = 2;
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
            case tuesday:
                System.out.println("Tuesday");
        }

        // Тернарный оператор
        int number = 25;
        System.out.println((number % 2 == 0) ? "odd" : "even");

        // for
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // метка для цикла с break
        m: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 3) {
                    break m;
                }
                System.out.print("m" + i + j + " ");
            }
            System.out.println("");
        }
        System.out.println();

        // Побитовые операции
        int x = 25647;
        int y = 23126;
        System.out.println("x ---> " + Integer.toBinaryString(x) + " - " + x);
        System.out.println("y ---> " + Integer.toBinaryString(y) + " - " + y);
        // Побитвое ИЛИ (побитовое сложение)
        System.out.println("x|y -> " + Integer.toBinaryString(x|y) + " - " + (x|y));
        // Побитвое И (побитовое умножение) используется для наложения масок
        System.out.println("x&y -> " + Integer.toBinaryString(x&y) + " - " + (x&y));
        // Побитвое xOR
        System.out.println("x^y ->  " + Integer.toBinaryString(x^y) + " - " + (x^y));

        // Побитовая проверка
        byte z = Byte.valueOf("00100010", 2);
        // То же самое
        byte zz = 0b00100010;
        System.out.println(z);
        System.out.println(zz);
        // проверяем второй байт (маска для второго датчика)
        byte twoByte = 0b00000010;
        // если true то второй байт равен 1
        System.out.println((z & twoByte) == 1);

        // Побитовые сдвиги
        System.out.println("x ---->   " + Integer.toBinaryString(x) + " - " + x);
        // Побитовый сдвиг на 2 то же самое что делить на 4
        System.out.println("x>>2 ->     " + Integer.toBinaryString(x >> 2) + " - " + (x >> 2));
        // Побитовый сдвиг на 2 то же самое что умножить на 4
        System.out.println("x<<2 -> " + Integer.toBinaryString(x << 2) + " - " + (x << 2));
        //сдвиг отрицательного числа
        int v = -64394;
        System.out.println("v -----> " + Integer.toBinaryString(v) + " - " + v);
        // Слева дописывается такой ее же значение, как и в самом левом бите и знак сохраняется
        System.out.println("v>>2 --> " + Integer.toBinaryString(v >> 2) + " - " + (v >> 2));
        // Слева дописываются нули и знак меняется
        System.out.println("v>>>2 ->   " + Integer.toBinaryString(v >>> 2) + " - " + (v >>> 2));
        // Побитовое инвертирование
        System.out.println("v -----> " + Integer.toBinaryString(v) + " - " + v);
        System.out.println("~v ---->                 " + Integer.toBinaryString(~v) + " - " + (~v));
    }

    // if
    public int calculateSalary(int workDays) {
        int salary;
        if (workDays > WORK_DAYS_NORM) {
            salary = 5000;
        } else {
            salary = 2000;
        }
        return salary;
    }

    private static boolean method2(boolean b) {
        System.out.println("method2(" + b + ")");
        return b;
    }

    private static boolean method1(boolean b) {
        System.out.println("method1(" + b + ")");
        return b;
    }

}
