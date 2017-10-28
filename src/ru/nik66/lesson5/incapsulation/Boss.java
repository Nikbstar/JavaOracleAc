package ru.nik66.lesson5.incapsulation;

public class Boss {

    private String name;
    private static Boss instance = null;

    // Метод фабрика
    public static Boss getInstance(String name) {
        if (instance == null) {
            instance = new Boss(name);
        } else {
            instance.setName(name);
        }
        return instance;
    }

    // Запрет на создание объекта
    private Boss(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }
}
