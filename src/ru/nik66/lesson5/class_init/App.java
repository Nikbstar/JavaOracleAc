package ru.nik66.lesson5.class_init;

public class App {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        MyClass myClass1 = new MyClass();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        MyClass myClass2 = new MyClass();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
}

class MyClass {
    public Field field1 = new Field("field1");
    public static Field staticField1 = new Field("staticField1");
    {
        System.out.println("init block");
    }
    public MyClass() {
        System.out.println("constructor");
    }
    public Field field2 = new Field("field2");
    public static Field staticField2 = new Field("staticField2");
    static {
        System.out.println("static init block");
    }

}
class Field {
    public Field(String message) {
        System.out.println(message);
    }
}