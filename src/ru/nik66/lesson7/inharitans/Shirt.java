package ru.nik66.lesson7.inharitans;

/**
 * Created by 075KotkinNA on 30.10.2017.
 */
public class Shirt extends Clothing {

    private int size;
    public char color;

    public Shirt(String brand, int price, char color, int size, char shirtColor) {
        // Всегда сначала идет заргузка конструктора родительского класса
        super(brand, price, color);
        setSize(size);
        this.color = shirtColor;
    }


    // Переопределили родительский метод, загрузили родительский и добавили свои параметры
    @Override
    public void wash() {
        super.wash();
        setSize(--size);
    }

    // Переопределение родительского метода
    @Override
    public String toString() {
        return "Shirt{" +
                "brand='" + getBrand() + '\'' +
                ", price=" + getPrice() +
                ", color=" + color +
                ", size=" + getSize() +
                ", color=" + super.color +
                '}';
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
