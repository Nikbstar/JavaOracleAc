/**
 * Домашнее задание
 * Реализовать программу учета среднесуточной темперауры на протяжении месяца. Ввод данных
 * реализовать с консоли. Вначале должен быть выведен запрос названия месяца, затем значений
 * температуры для каждого числа. Количество дней в месяце программа должна определять
 * автоматически. Значения хранить в ArrayList. При вводе реализовать проверку корректности
 * вводимых данных, если данные введены не корректно - запросить ввод повторно. После
 * введения данных вывести среднемесячную температуру, дату когда была максимальная
 * температура и минимальная с указанием ее значения.
 */
package ru.nik66.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeperatureStart {

    public static void main(String[] args) throws IOException {
        Temperature temperature = new Temperature();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Enter month: ");
        } while (!temperature.setMonth(br.readLine()));
        for (int i = 0; i < temperature.getDays(); i++) {
            do {
                System.out.println("Enter " + (i + 1) + " " + temperature.getMonth() + " temp: ");
            } while (!temperature.addTempInDB(br.readLine()));
        }
        System.out.println("Average " + temperature.getMonth() + " temp: " + temperature.avgMinMaxTemp());
        System.out.println("Min temp was " + temperature.getMinTempDay() + " " +
                temperature.getMonth() + ": " + temperature.getMinTemp());
        System.out.println("Max temp was " + temperature.getMaxTempDay() + " " +
                temperature.getMonth() + ": " + temperature.getMaxTemp());
    }

}
