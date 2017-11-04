package ru.nik66.practice3;

import java.util.ArrayList;

public class Firm {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    public Employee findEmployee(String family) {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getFamily() == family) {
                result = employee;
            }
        }
        return result;
    }

    public void totalSalary() {
        double total = 0.;
        employees.sort((a, b) -> a.getFamily().compareToIgnoreCase(b.getFamily()));
        for (Employee employee : employees) {
            System.out.println(employee);
            total += employee.calculateSalary();
        }
        System.out.println("Total salary: " + total);
    }

}
