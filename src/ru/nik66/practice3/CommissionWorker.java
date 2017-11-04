package ru.nik66.practice3;

public class CommissionWorker extends Employee {

    private double salesAmount;
    public static final double COMMISION_ON_SALES = 10.;
    public static final double BASE_SALARY = 10000.;

    public CommissionWorker(String name, String family, double salesAmount) {
        super(name, family);
        setSalesAmount(salesAmount);
    }

    @Override
    public double calculateSalary() {
        return (getSalesAmount() * COMMISION_ON_SALES / 100) + BASE_SALARY;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
