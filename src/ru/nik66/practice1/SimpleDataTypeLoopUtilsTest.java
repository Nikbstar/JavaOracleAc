package ru.nik66.practice1;

public class SimpleDataTypeLoopUtilsTest {

    public static void main(String[] args) {
        System.out.println("~~~ Test 1 ~~~");
        SimpleDataTypeLoopUtils.printingTypes();

        System.out.println("~~~ Test 2 ~~~");
        SimpleDataTypeLoopUtils.floatType();

        System.out.println("~~~ Test 3 ~~~");
        SimpleDataTypeLoopUtils.shortType();

        System.out.println("~~~ Test 4 ~~~");
        int a = 4;
        int b = 5;
        int c = 3;
        System.out.println("a: " + a + "; b: " + b + "; c: " + c);
        SimpleDataTypeLoopUtils.checkRightTriangle(a, b, c);

        System.out.println("~~~ Test 5 ~~~");
        SimpleDataTypeLoopUtils.oneToTwentySumm();

        System.out.println("~~~ Test 6 ~~~");
        SimpleDataTypeLoopUtils.oneToTwentyOddSumm();

        System.out.println("~~~ Test 7 ~~~");
        SimpleDataTypeLoopUtils.oneToTwentyPrimeSumm();

        System.out.println("~~~ Test 8 ~~~");
        a = 3;
        b = 2;
        c = 1;
        System.out.println("a: " + a + "; b: " + b + "; c: " + c);
        SimpleDataTypeLoopUtils.aPlusBEqualsC(a, b, c);

        System.out.println("~~~ Test 9 ~~~");
        System.out.println(SimpleDataTypeLoopUtils.meanValue(10, 1));

        System.out.println("~~~ Test 10~~~");
        Credit.creditCalculation(200000, 5, 12);

    }

}
