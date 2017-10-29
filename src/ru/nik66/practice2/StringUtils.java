package ru.nik66.practice2;

public class StringUtils {

    // 1. Заданы 2 произвольных строки. Из этих строк создать одну объединенную без первых
    // символов в каждой из строк.
    public static String concWithOutFirstSymbols(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    // 2. Задана строка с нечетным количеством символов. Создайте строку, состоящую из 3-х
    // символов, например: "Candy" -> "and", "solving" -> "lvi".
    public static String getThreeCentralSymbols(String s) {
        int start = (s.length() / 2) - 1;
        return s.substring(start, start + 3);
    }

    // 3. Задана строка произвольного размера. Создайте из этой строки новую, в которой 2
    // последних символа исходной строки перенесены в начало.
    public static String twoLastSymbolsMoveToStart(String s) {
        return s.substring(s.length() - 2) + s.substring(0, s.length() - 2);
    }

    // 4. Из заданной строки составьте новую, в которой каждый исходный символ представлен
    // двумя, например: "Candy" -> "CCaannddyy".
    public static String doubleSymbols(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length() * 2);
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i)).append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    // 5. Найдите все вхождения строки "b*b" (* - любой символ) в заданной строке без
    // использования регулярных выражений, например "bob is bab" -> 2.
    public static int calculateSymbolOccurance(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == c && s.charAt(i + 2) == c) {
                count++;
            }
        }

        return count;
    }
    public static int calculateSymbolOccurance(String s) {
        return calculateSymbolOccurance(s, 'b');
    }

    // 6. Создайте подстроку из исходной строки, где в каждом слове, содержащем символ "*"
    // удалены соседние левый и правый символы, например "th*is is sum*mer" -> "ts is suer".
    public static String deleteAraundStar(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if ((i < s.length() - 1 && s.charAt(i + 1) == '*') || s.charAt(i) == '*' || (i > 0 && s.charAt(i - 1) == '*')) {
                continue;
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    // 7. В заданной строке подсчитайте количество слов, заканчивающихся на 'a' или 's', без
    // учета регистра символов.
    public static int wordsCounter(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1 == s.length() || s.charAt(i + 1) == ' ') && (s.charAt(i) == 's' || s.charAt(i) == 'a')) {
                count++;
            }
        }
        return count;
    }

    // 8. Заданы две строки. Создайте новую строку, состоящую из первой строки, в которой
    // удалены все вхождения второй строки.
    public static String deleteSubstring(String str, String sub) {
        StringBuilder stringBuilder = new StringBuilder(str.length() - sub.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sub.charAt(0) && i + sub.length() <= str.length()) {
                int check = 0;
                for (int j = 0; j < sub.length(); j++) {
                    if (str.charAt(i + j) == sub.charAt(j)) {
                        check++;
                    }
                }
                if (check == sub.length()) {
                    i += check - 1;
                } else {
                    stringBuilder.append(str.charAt(i));
                }
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

}
