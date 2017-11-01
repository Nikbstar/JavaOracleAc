package ru.nik66.lesson8;

public class App {

    public static void main(String[] args) {
        Clothing clothing = new Shirt("nike", 20, 50, 'G');
        Shirt shirt = new Shirt("adidas", 200, 50, 'R');

        shirt.wash();
        // вызов абстрактного метода wash у Clothing, который реализован в Shirt
        clothing.wash();
    }

}
