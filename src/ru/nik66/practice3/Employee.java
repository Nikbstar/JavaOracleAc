package ru.nik66.practice3;

public abstract class Employee {
    private String name;
    private String family;

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return  getFamily() + " " +
                getName() + ", " +
                this.getClass().getSimpleName() + ", " +
                calculateSalary() + " rub.";
    }

    public Employee(String name, String family) {
        setName(name);
        setFamily(family);
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
