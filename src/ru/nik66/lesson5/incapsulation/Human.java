package ru.nik66.lesson5.incapsulation;

/**
 * Created by 075kotkinna on 26.10.2017.
 */
public class Human {

    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 100;
    private String name;
    private byte age;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            this.age = (byte) age;
        } else {
            System.out.println("Wrong input, use age from " + MIN_AGE + " to " + MAX_AGE);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

}
