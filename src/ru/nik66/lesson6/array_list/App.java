package ru.nik66.lesson6.array_list;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        // Создание ArrayList на 10 элементов (это не размер массива).
        ArrayList<String> stringArrayList = new ArrayList<>(10);
        // Добавить новый элемент в список
        stringArrayList.add("One");
        stringArrayList.add("Two");
        stringArrayList.add(1, "Three");
        stringArrayList.add(stringArrayList.size(), "Five");
        // Изменить существующий элемент
        stringArrayList.set(2, "Six");
        System.out.println(stringArrayList);

        // Перебор элементов
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.print(stringArrayList.get(i) + " ");
        }
        System.out.println();
        for (String s : stringArrayList) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Удаление элемента из списка
        stringArrayList.remove(2);
        System.out.println(stringArrayList);

        // Удалить пустые ячейки массива
        stringArrayList.trimToSize();
    }

}
