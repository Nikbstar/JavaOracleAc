package ru.nik66.practice3;

public class PieceWorker extends Employee {

    private double productPrice;
    private int productsNumber;

    public PieceWorker(String name, String family, double productPrice, int productsNumber) {
        super(name, family);
        setProductPrice(productPrice);
        setProductsNumber(productsNumber);
    }

    @Override
    public double calculateSalary() {
        return getProductPrice() * getProductsNumber();
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductsNumber() {
        return productsNumber;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductsNumber(int productsNumber) {
        this.productsNumber = productsNumber;
    }
}
