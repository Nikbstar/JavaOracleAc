package ru.nik66.lesson6.string;

public class App {

    public static void main(String[] args) {
        String name1 = new String("Kolya");
        String name2 = "Kolya";
        String name3 = "Kolya";
        // Когда вызываем конструктор, всегда создается новый объект
        System.out.println(name1 == name2);
        // Тут строки записываются в пул строк.
        System.out.println(name2 == name3);
        // Вернуть количество символов в строке.
        System.out.println(name1.length());

        String s = "Mama mila ramu";
        // узнать какой сивол находится на позиции 3
        System.out.println(s.charAt(3));
        // Возвращает позицию первого попавшегося символа i
        System.out.println(s.indexOf('a'));
        // Ищет строку
        System.out.println(s.indexOf("mi"));
        // Поиск начинается с конца строки
        System.out.println(s.lastIndexOf('a'));
        // Начать поиск с позиции 4
        System.out.println(s.indexOf('a', 4));
        System.out.println(s.lastIndexOf('a', 4));
        System.out.println(searchChar(s, 'a'));
        findSymbolsIndexInString(s, 'a');

        // Вырезать часть строки (с позиции 3 до 7)
        String s1 = s.substring(3, 7);
        System.out.println(s1);

        // Замена символов в строке
        System.out.println(s.replace('m', 'p'));

        // StringBuilder - работа со строками, лучшая производительность
        // создает массив чаров из 16 элементов
        StringBuilder stringBuilder = new StringBuilder();
        // Длина строки (количество символов в строке)
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        // Емкость строки (размер массива, в котором могут храниться символы)
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());
        // создает массив чаров из строки s + 16 пустых элементов
        stringBuilder = new StringBuilder(s);
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());

        // Наращирание строки
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i).append(" ");
            System.out.println("stringBuilder.length() = " + stringBuilder.length());
            System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());
        }
    }

    // Вывести позиции символа в строке
    public static void findSymbolsIndexInString(String s, char c) {
        System.out.println(s);
        // способ 1
        for (int index = 0; (index = s.indexOf(c, index)) != -1; index++) {
            System.out.println(c + ": " + index);
        }
        //// способ 2
        //int index = s.indexOf(c);
        //while (index != -1) {
        //    System.out.println(c + ": " + index);
        //    index = s.indexOf(c, index + 1);
        //}

    }

    // Количество символов в строке
    public static int searchChar(String s, char c) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result++;
            }
        }
        return result;
    }

}
