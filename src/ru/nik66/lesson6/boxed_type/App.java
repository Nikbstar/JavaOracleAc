package ru.nik66.lesson6.boxed_type;

public class App {

    public static void main(String[] args) {
        Integer x, y, z;
        // Boxing
        x = 12;
        y = 12;
        // Вот так это выглядит
        z = Integer.valueOf(12);

        // Unboxing
        System.out.println(x + y);

        // До 127 адреса на обертки хранятся в массиве и по массиву возвращается
        // уже созданный объект, после 127 каждый раз создается новый объект.
        System.out.println(x == y);
        x = 212;
        y = 212;
        System.out.println(x == y);

        // Парсер строк в инт
        int i = Integer.parseInt("258");
        // Парсер из строки двоичной системы в инт
        int b = Integer.parseInt("1101001", 2);
        System.out.println("b = " + b);
        System.out.println(Integer.toBinaryString(b));

    }

}
