package ru.nik66.lesson8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Clothing clothing = new Shirt("nike", 20, 50, 'G');
        Shirt shirt = new Shirt("adidas", 200, 50, 'R');

        shirt.wash();
        // вызов абстрактного метода wash у Clothing, который реализован в Shirt
        clothing.wash();

        List<String> stringList = (List<String>) readProperties("properties.txt");

        stringList.add("Hello");
        stringList.add("world");
        System.out.println(stringList);

        // Использование интерфейса для реализации метода clean
        Loundry panda = new Loundry();
        panda.clean(shirt);

        Clothing[] clothingArray = {
                new Shirt("nike", 100, 30, 'G'),
                new Shirt("adidas", 50, 50, 'S'),
                new Shirt("adidas", 200, 30, 'B'),
                new Trousers("Boss", 1000),
                new Trousers("abibas", 80)
        };
        // Чтобы сделать сортировку, ножно имплементировать интерфейс Comparable
        Arrays.sort(clothingArray);
        for (Clothing clothing1:  clothingArray) {
            System.out.println(clothing1);
        }
        System.out.println("~~~~~~~~~~~~~~");
        Arrays.sort(clothingArray, new ClotheComparator());
        for (Clothing clothing1:  clothingArray) {
            System.out.println(clothing1);
        }
        System.out.println("~~~~~~~~~~~~~~");
        // Лямбда выражение (a, b) -> b.getPrice() - a.getPrice()
        // То же что и предыдущая запись + файл сласса
        Arrays.sort(clothingArray, (a, b) -> b.getPrice() - a.getPrice());
        for (Clothing clothing1:  clothingArray) {
            System.out.println(clothing1);
        }

        for (String s: stringList) {
            System.out.println(s);
        }
        // foreach в лямбда выражении (эквивалентно записи выше)
        stringList.forEach(a -> System.out.println(a));
        // то же самое только с использованием ссылки на метод
        stringList.forEach(System.out::println);

        for (Clothing clothing1 : clothingArray) {
            clothing1.wash();
        }
    }

    // Читает из файла название класса и подставляет его для создания ArrayList
    public static Object readProperties(String path) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String className = br.readLine();
        return Class.forName(className).newInstance();
    }

}
