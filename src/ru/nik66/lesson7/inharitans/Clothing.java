package ru.nik66.lesson7.inharitans;

/**
 * Created by 075KotkinNA on 30.10.2017.
 */
public class Clothing {

    private String brand;
    private int price;
    public char color;

    public Clothing(String brand, int price, char color) {
        setBrand(brand);
        setPrice(price);
        this.color = color;
    }

    public void wash() {
        System.out.println("Good is washed");
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
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
}
