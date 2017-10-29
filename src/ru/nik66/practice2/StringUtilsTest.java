package ru.nik66.practice2;

public class StringUtilsTest {

    public static void main(String[] args) {
        System.out.println("~~~ Test 1 ~~~");
        String expectedResult = "wesd";
        String a1 = "qwe";
        String b1 = "asd";
        String result1 = StringUtils.concWithOutFirstSymbols(a1, b1);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result1);
        System.out.println((result1.equals(expectedResult)) ? "Test OK" : "Test fault");

        System.out.println("~~~ Test 2 ~~~");
        expectedResult = "and";
        String a2 = "Candy";
        String result2 = StringUtils.getThreeCentralSymbols(a2);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result2);
        System.out.println((result2.equals(expectedResult)) ? "Test OK" : "Test fault");
        expectedResult = "lvi";
        a2 = "solving";
        result2 = StringUtils.getThreeCentralSymbols(a2);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result2);
        System.out.println((result2.equals(expectedResult)) ? "Test OK" : "Test fault");

        System.out.println("~~~ Test 3 ~~~");
        expectedResult = "tyqwer";
        String s3 = "qwerty";
        String result3 = StringUtils.twoLastSymbolsMoveToStart(s3);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result3);
        System.out.println((result3.equals(expectedResult)) ? "Test OK" : "Test fault");

        System.out.println("~~~ Test 4 ~~~");
        expectedResult = "CCaannddyy";
        String s4 = "Candy";
        String result4 = StringUtils.doubleSymbols(s4);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result4);
        System.out.println((result4.equals("CCaannddyy")) ? "Test OK" : "Test fault");

        System.out.println("~~~ Test 5 ~~~");
        expectedResult = "2";
        String s5 = "bab is bab";
        int result5 = StringUtils.calculateSymbolOccurance(s5);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result5);
        System.out.println((result5 == Integer.parseInt(expectedResult)) ? "Test OK" : "Test fault");

        System.out.println("~~~ Test 6 ~~~");
        expectedResult = "ts is suer";
        String s6 = "th*is is sum*mer";
        String result6 = StringUtils.deleteAraundStar(s6);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result6);
        System.out.println((result6.equals(expectedResult)) ? "Test OK" : "Test fault");

        System.out.println("~~~ Test 7 ~~~");
        expectedResult = "3";
        String s7 = "this IS a summer day";
        int result7 = StringUtils.wordsCounter(s7);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result7);
        System.out.println((result7 == Integer.parseInt(expectedResult)) ? "Test OK" : "Test fault");

        System.out.println("~~~ Test 8 ~~~");
        expectedResult = "tis summer";
        String s8 = "this is summer";
        String a8 = "his ";
        String result8 = StringUtils.deleteSubstring(s8, a8);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result8);
        System.out.println((result8.equals(expectedResult)) ? "Test OK" : "Test fault");
        expectedResult = "";
        a8 = "this is summer";
        result8 = StringUtils.deleteSubstring(s8, a8);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result:          " + result8);
        System.out.println((result8.equals(expectedResult)) ? "Test OK" : "Test fault");
    }

}
