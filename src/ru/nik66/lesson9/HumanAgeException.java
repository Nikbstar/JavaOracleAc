// Класс для age, создаем иерархию ошибок
package ru.nik66.lesson9;

public class HumanAgeException extends HumanException {
    public HumanAgeException(String message) {
        super(message);
    }
}
