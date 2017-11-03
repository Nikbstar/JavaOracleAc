package ru.nik66.lesson8;

public abstract class Clothing implements Cleanable, Comparable<Clothing> {

    private String brand;
    private int price;

    @Override
    public String toString() {
        return "Clothing{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Clothing o) {
        return this.getPrice() - o.getPrice();
    }

    public Clothing(String brand, int price) {
        setBrand(brand);
        setPrice(price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public abstract void wash();

}
