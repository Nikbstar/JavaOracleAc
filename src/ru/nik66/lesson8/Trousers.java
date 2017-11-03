package ru.nik66.lesson8;

public class Trousers extends Clothing {
    public Trousers(String brand, int price) {
        super(brand, price);
    }



    @Override
    public void wash() {
        System.out.println("Trousers is clean!");
    }

    @Override
    public String howToClean() {
        return " 20 degree";
    }
}
