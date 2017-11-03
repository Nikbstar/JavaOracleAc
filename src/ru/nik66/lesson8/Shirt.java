package ru.nik66.lesson8;

public class Shirt extends Clothing {

    private int size;
    private char color;

    public Shirt(String brand, int price, int size, char color) {
        super(brand, price);
        setColor(color);
        setSize(size);
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size=" + getSize() +
                ", color=" + getColor() +
                ", brand='" + getBrand() + '\'' +
                ", price=" + getPrice() +

                '}';
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public char getColor() {
        return color;
    }

    @Override
    public void wash() {
        System.out.println("Shirt is clear!");
    }

    @Override
    public String howToClean() {
        return "50 degree";
    }
}
