package ru.nik66.lesson7.java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Created by 075KotkinNA on 30.10.2017.
 */
public class App {

    public static void main(String[] args) {
        // Сохраняет в переменную точное время которое было во время создания объекта
        LocalDateTime dateTime = LocalDateTime.now();
        String time = dateTime.toString();
        // По стандарту выводит iso формат времени
        System.out.println(dateTime);
        // Локализовать формат времени под локаль системы.
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String localDateTime = dateTime.format(formatter);
        System.out.println(localDateTime);
        // Кастомное представление даты и времени
        String pattern = "H':'mm':'ss' -'E dd'/'MMMM'/'yyyy";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern);
        String localDateTime2 = dateTime.format(formatter2);
        System.out.println(localDateTime2);
        // Установить локаль вкучную
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern(pattern, Locale.CHINA)));

        // Перевели дату и время в объект (распарсили)
        System.out.println(LocalDateTime.parse(time));
        System.out.println(LocalDateTime.parse(localDateTime2, formatter2));

    }

}
