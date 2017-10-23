package ru.nik66.lesson4;

import java.lang.reflect.Field;
import java.util.Arrays;

// Статческий импорь статических методов и полей
import static java.lang.Math.PI;

public class App {
    public static int count = 0;

    public static void main(String[] args) {
        // Вызывает конструктор класса Human, тем самым создаем объект и
        // адрес на нее присваеваем переменной типа Human.
        Human human = new Human("Vasya", 25);
        // Чтенее поля name класса Human
        System.out.println(human.name);
        // Запись в поле name класса Human
        human.name = "Kolya";
        System.out.println(human.name);
        System.out.println(human.age);

        System.out.println(human);
        // Передача по значению
        increaseAge(human.age);
        System.out.println(human);
        // Передача по ссылке
        increaseAge1(human);
        System.out.println(human);

        // Вызов метода born класса Human
        human.born();
        // Передача аргументов методу
        human.died(101);
        // Передача методва в качестве аргумента, с возвращаемым значением int
        human.died((int) (Math.random() * 100));

        // Обращение к статической переменной через объект - плохой вариант
        System.out.println(human.type);
        // Обращение к статической переменной через имя класса - хороший вариань
        System.out.println(Human.type);
        // Создали новый объект типа Human
        Human human1 = new Human("Katya", 23);
        // У нового объекта переопределили статическое поле
        human1.type = "Human v2";
        // У старого объекта оно тоже изменилось!
        System.out.println(human.type);

        System.out.println(sum(2, 3));

        // Класс class
        // Вывести все поля класса Human
        for (Field field : Human.class.getFields()) {
            System.out.println(field);
        }

        // Статический импорт (вврху)
        System.out.println(PI);

        // Рекурсия
        recursy(0);
        System.out.println(fibonacci(10));
        System.out.println(count);
    }

    // Рекурсия
    public static void recursy(int i) {
        System.out.println(i);
        if (i < 10) {
            recursy(i + 1);
        }
        System.out.println(i);
    }
    public static int fibonacci(int n) {
        count++;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Перегрузка методов
    public static int sum(double a, double b) {
        System.out.println("double a, double b");
        return (int) (a + b);
    }
    public static int sum(short a, short b) {
        System.out.println("short a, short b");
        return a + b;
    }
    // Аргумент переменной длинны (массив аргумнтов)
    public static int sum(int... a) {
        System.out.println("int... a");
        return Arrays.stream(a).sum();
    }

    // Передача по значению
    public static void increaseAge(int age) {
        age++;
    }

    // Передача по ссылке
    public static void increaseAge1(Human human) {
        human.age++;
    }


}
