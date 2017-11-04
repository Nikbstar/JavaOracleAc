package ru.nik66.practice3;

public class Boss extends Employee {

    public static final int WEEK = 7;
    public static final int MONTH = 30;
    private double weekSalary;

    public Boss(String name, String family, double weekSalary) {
        super(name, family);
        setWeekSalary(weekSalary);
    }

    @Override
    public double calculateSalary() {
        return getWeekSalary() / WEEK * MONTH;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }
}
