package ru.nik66.lesson4;

public class Human {

    public static String type = "Human";
    public String name;
    public int age;

    // Конструктор класса
    public Human(String name, int age) {
        // this нужен для обращения к полям и методом этого класса
        this.name = name;
        this.age = age;
        born();
    }
    // Перегруженный конструктор
    public Human(String name) {
        // this с аргументами в конструкторе (должен быть только первым)
        this(name, 1);
    }

    public void born() {
        System.out.println("Hello, my name is " + name);
    }

    public void died(int year) {
        System.out.println(name + " died after " + year + " year");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
