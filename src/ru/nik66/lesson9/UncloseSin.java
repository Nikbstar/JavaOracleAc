package ru.nik66.lesson9;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// FilterInputStream - специальный класс для внесения изменения
// (или добавления своей локики) в работу потока ввода вывода
// Чтобы не закрывался System.in нужно передать in родителю и
// переопределить метод close()
public class UncloseSin extends FilterInputStream {

    public UncloseSin(InputStream in) {
        // передаем in родителю
        super(in);
    }

    // Убираем реализацию метода close() чтобы он не закрывал входящий in потк
    @Override
    public void close() throws IOException {
        // NOP - No operation пишется чтобы обозначить что бы не забыли реализовать метод, а специально это сделали
    }
}
