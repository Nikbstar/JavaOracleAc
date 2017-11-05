package ru.nik66.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        //System.out.println(createHumanConsole());
        //System.out.println(createHumanConsole());
        System.out.println(createHumanConsoleInstantly());
    }

    private static Human createHumanConsoleInstantly() {
        Human human = new Human();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UncloseSin(System.in)))) {
            while (true) {
                try {
                    System.out.println("Input human's name: ");
                    String name = br.readLine();
                    human.setName(name);
                    break;
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    int age = readNumber(br, "Input human's age");
                    human.setAge(age);
                    break;
                } catch (HumanAgeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return human;
    }

    private static Human createHumanConsole() {
        Human human = null;
        /* Устарело
        // создаем стрим чтерия символов с клавиатуры
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Input human's name: ");
            String name = br.readLine();
            System.out.println("Input human's age: ");
            int age = Integer.parseInt(br.readLine());
            // в цикде проверяем правильность ввода нанных
            while (true) {
                try {
                    human = new Human(name, age);
                    break;
                // что делать если неправильно ввели age и вернулась HumanAgeException вместо результата
                } catch (HumanAgeException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Input human's age: ");
                    age = Integer.parseInt(br.readLine());
                // что делать если неправильно ввели name и вернулась HumanNameException вместо результата
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Input human's name: ");
                    name = br.readLine();
                // блок, который обязательно выполнится, независимо от появления ошибок
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Любой стрим надо обязательно закрывать, чтобы ОС понимала что он больше не используется
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

        // try with resources - позволяет указать какие ресурсы должны быть высвобождены,
        // после выполнения try
        // в скобках можно указать несколько ресурсов черех ';'
        // Чтобы перехватить закрытие System.in, создаем сой класс перехватчик UncloseSin()
        // и помещаем в него System.in
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UncloseSin(System.in)))) {
            System.out.println("Input human's name: ");
            String name = br.readLine();
            System.out.println("Input human's age: ");
            int age = readNumber(br, "Input human's age");
            // в цикде проверяем правильность ввода нанных
            while (true) {
                try {
                    human = new Human(name, age);
                    break;
                    // что делать если неправильно ввели age и вернулась HumanAgeException вместо результата
                } catch (HumanAgeException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Input human's age: ");
                    age = readNumber(br, "Input human's age");
                    // что делать если неправильно ввели name и вернулась HumanNameException вместо результата
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Input human's name: ");
                    name = br.readLine();
                    // блок, который обязательно выполнится, независимо от появления ошибок
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return human;
    }

    private static int readNumber(BufferedReader br, String message) throws IOException {
        int number;
        while (true) {
            System.out.println(message);
            try {
                number = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong value format");
                System.out.println(message);
            }
        }
        return number;
    }
}
