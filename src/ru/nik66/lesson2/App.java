// Папка
package ru.nik66.lesson2;

// Загрузка методов из других папок
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Объявлние публичного класса, имя совпадает с названием файла
public class App {

    // Статическое поле класса
    public static int age;

    // Поля класса
    int i, y = 9, h;

    // Константа
    final static int MIN_AGE;

    // Присваивание значения константе
    static {
        MIN_AGE = 5;
    }

    // Запускающий метод
    public static void main(String[] args) {

        // Локальная переменная
        int i = 34;
        System.out.println(i);
        // Hex значение
        i = 0x34;
        System.out.println(i);

        byte b = 127;
        System.out.println(b);
        // Делаем отрицательне число
        // ~ - побитовое инвентирование числа
        b = (byte) (~b + 1);
        System.out.println(b);
        // нижнее подчеркивание игнорируется компилятором
        System.out.println(12_345_678);

        // Символы
        char myChar1 = 'A';
        // Dec код символа
        char myChar2 = 65;
        // Unicode Hex код символа
        char myChar3 = '\u0041';
        System.out.println(myChar1);
        System.out.println(myChar2);
        System.out.println(myChar3);

        System.out.println('Б');
        // Смотрим код символа
        System.out.println((int) 'Б');

        // Погрешность расчетов в дробных числах
        double d = 0;
        for (int j = 0; j < 100; j++) {
            d = d + 0.1;
            System.out.println(d);
        }

        // погрешность при сравнении float и double
        double v = 0.5;
        float v1 = 0.5f;
        System.out.println(v == v1);
        v = 0.1;
        v1 = 0.1f;
        System.out.println(v == v1);

        // логический тип данных
        boolean bool = true;

        // Печатаем поле класа
        System.out.println(age);

        // Маскируем поле класса локальной переменной
        int age = 1;
        System.out.println(age);

        // объявление локальной константы
        final int MAX_AGE;
        // присваивать значение константе можно позже
        MAX_AGE = 5;
        System.out.println(MAX_AGE);

        // Остаток от деления, проверяем на четность
        System.out.println(243 % 2 == 0);

        // Остаток от деления, выписываем два крайних числа
        System.out.println(3456 % 100);

        i = 2;
        // 6
        i = i++ + ++i;
        System.out.println(i);
        i = 2;
        // 20
        i += i++ + ++i * i++;
        System.out.println(i);

        byte myByte = 25;
        // автоматическое расширние типа
        int myInt = myByte;

        byte b1 = 2 + 5;
        System.out.println(b1);
        final byte b2 = 2;
        final byte b3 = 5;
        // можно присваивать только константы
        b1 = b2 + b3;
        byte b4 = 2;
        byte b5 = 5;
        // принудительно приведение типа и присваивание
        b1 = (byte) (b4 + b5);

        // переполнение памяти
        int i1 = 1000_000 * 1000_1000;
        System.out.println(i1);
        long l1 = 1000_000 * 1000_1000L;
        System.out.println(l1);


        double d1 = 3/4;
        System.out.println(d1);
        // делаем double
        double d2 = 3/4D;
        System.out.println(d2);

        // деление на ноль в дробных числах
        System.out.println(5/0.);
        // деление на бесконечность
        System.out.println(5/0. - 6/.0);
        System.out.println(5/0. - 5);

        // перевод времени с помощью остатка от деления
        int time = 5628;
        int hours = time / 3600;
        int min = (time % 3600) / 60;
        int sec = (time % 3600) % 60;
        System.out.println(hours + ":" + min + ":" + sec);
        LocalTime localTime = LocalTime.ofSecondOfDay(time);
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("H:mm:ss")));

    }

}
