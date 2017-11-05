// Класс для name, создаем иерархию ошибок
package ru.nik66.lesson9;

public class HumanNameException extends HumanException {
    public HumanNameException(String message) {
        super(message);
    }
}
