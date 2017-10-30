package ru.nik66.lesson7.inharitans;

/**
 * Created by 075KotkinNA on 30.10.2017.
 */
public class App {

    public static void main(String[] args) {
        Shirt shirt = new Shirt("Nike", 500, 'B', 50, 'W');
        shirt.setPrice(500);
        System.out.println(shirt);

        // Хайдинг полей можно запутаться.
        shirt.color = 'R';
        // shirt унаследовал тип родителя и его можно присвоить переменной типа Clothing
        // от типа ссылочной переменной зависит к каким полям будет обращаться созданный объект (родителя или дочерний)
        Clothing clothing = shirt;
        clothing.color = 'G';
        // Выводит R
        System.out.println(shirt.color);
        // Выводит G т. к. загружается toString у класса Clothing, а у него свое поле color
        System.out.println(shirt);
        shirt.wash();
        System.out.println(shirt);

        C c = new C();
    }

}

class A {
    public Field fieldA = new Field("fieldA");
    public static Field staticFieldA = new Field("staticFieldA");
    {
        System.out.println("init block A");
    }
    public A() {
        System.out.println("Constructor A");
    }
    static {
        System.out.println("static init block A");
    }
}
class B extends A {
    public Field fieldB = new Field("fieldB");
    public static Field staticFieldB = new Field("staticFieldB");
    {
        System.out.println("init block B");
    }
    public B() {
        this(5);
        System.out.println("Constructor B");
    }
    public B(int i) {
        System.out.println("Constructor B(int i)");
    }
    static {
        System.out.println("static init block B");
    }
}
class C extends B {
    public Field fieldC = new Field("fieldC");
    public static Field staticFieldC = new Field("staticFieldC");
    {
        System.out.println("init block C");
    }
    public C() {
        System.out.println("Constructor C");
    }
    static {
        System.out.println("static init block C");
    }
}
class Field {
    public Field(String message) {
        System.out.println(message);

    }
}