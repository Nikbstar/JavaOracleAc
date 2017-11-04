package ru.nik66.practice3;

public class HourlyWorker extends Employee {

    private double hourSalary;
    private int hoursWorked;
    public static final double OVERTIME_FACTOR = 2.;
    public static final int STANDARD_HOUR = 160;

    public HourlyWorker(String name, String family, double hourSalary, int hoursWorked) {
        super(name, family);
        setHourSalary(hourSalary);
        setHoursWorked(hoursWorked);
    }

    @Override
    public double calculateSalary() {
        double result;
        if (getHoursWorked() > STANDARD_HOUR) {
            result = (STANDARD_HOUR * getHourSalary()) +
                    ((getHoursWorked() - STANDARD_HOUR) * getHourSalary() * OVERTIME_FACTOR);
        } else {
            result = getHoursWorked() * getHourSalary();
        }
        return result;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
