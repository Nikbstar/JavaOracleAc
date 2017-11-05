package ru.nik66.lesson9;

public class Human {

    // magic numbers. Все константы обязательно выносить отдельно
    // чтобы понимать что за число в коде и не искать их везде по коду при необходимости изменить
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 100;
    public static final int MIN_NAME_LENGTH = 1;
    private String name;
    private int age;

    public Human() {}

    // передаем ошибки от name и age вызываемому нас методу, чтобы он разбирался с ними
    public Human(String name, int age) throws HumanAgeException, HumanNameException {
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Передаем созданную нами ошибку предыдущему методу, чтобы он с ней разбирался
    public void setName(String name) throws HumanNameException {
        if (name.length() > MIN_NAME_LENGTH) {
            this.name = name;
        } else {
            // Если name введен не правильно, то создаем ошибку с сообщением
            throw new HumanNameException("Wrong name length, use length more then " + MIN_NAME_LENGTH + "symbols");
        }
    }

    // Передаем созданную нами ошибку предыдущему методу, чтобы он с ней разбирался
    public void setAge(int age) throws HumanAgeException {
        if (age > MIN_AGE && age < MAX_AGE) {
            this.age = age;
        } else {
            // Создаем свой пустой класс с названием ошибки и extends Exception (он нужен только ради типа)
            throw new HumanAgeException("Wrong age, use age from " + MIN_AGE + " to " + MAX_AGE);
        }
    }

}
