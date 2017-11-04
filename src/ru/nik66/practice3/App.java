package ru.nik66.practice3;

public class App {

    public static void main(String[] args) {
        Firm firm = new Firm();
        firm.addEmployee(new Boss("Kolya", "Kotkin", 20000.));
        firm.addEmployee(new CommissionWorker("Katya", "Fominih", 200000.));
        firm.addEmployee(new HourlyWorker("Ksusha", "Fominih", 100., 200));
        firm.addEmployee(new HourlyWorker("Lena", "Hz", 100., 100));
        firm.addEmployee(new PieceWorker("Alexandr", "Kuklovod", 500., 100));
        firm.totalSalary();
    }

}
