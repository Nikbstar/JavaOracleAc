// Создаем свой пустой класс с названием ошибки (он нужен только ради типа)
package ru.nik66.lesson9;

public class HumanException extends Exception {
    // Чтобы передать сообщение об ошибке
    public HumanException(String message) {
        super(message);
    }
}
