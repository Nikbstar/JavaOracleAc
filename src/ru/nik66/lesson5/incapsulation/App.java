package ru.nik66.lesson5.incapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        Human human = createHumanConsole();
        System.out.println(human);
        Boss boss = Boss.getInstance("Vasya");
        Boss boss1 = Boss.getInstance("Sveta");
        // Выведет Sveta, т. к. объект один
        System.out.println(boss);
    }

    private static Human createHumanConsole() throws IOException {
        Human human = null;
        // System.in - читает введенные символы побайтно.
        // InputStreamReader() - переводит полученные байты в char
        // BufferedReader() - Преобразует полученные чары в строку
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input human's name: ");
        // Считать тсроку и консоли и записать в name
        String name = br.readLine();
        System.out.println("Input human's age: ");
        int age = Integer.parseInt(br.readLine());
        human = new Human(name, age);
        return human;
    }

}
