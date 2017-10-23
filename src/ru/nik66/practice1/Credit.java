// 10) Написать программу расчета обяательных платежей кредита при польовании банковским кредитом.
// Исходные данные: Сумма кредита, процентная ставка, срок кредитования.
package ru.nik66.practice1;

public class Credit {

    public static void creditCalculation(double summ, int st, int sr) {
        monthCalc(summ, st, sr);
        fullCredit(summ, st, sr);
    }

    // а) Для каждого месяца ввывести на экран сумму к оплате по телу кредита и начисленные проценты.
    public static void monthCalc(double summ, int st, int sr) {
        double creditPercent = summ * st / 100;
        double creditFull = summ + creditPercent;
        double percentPerMonth = creditPercent / sr;
        double bodyPerMonth = summ / sr;
        for (int month = 1; month <= sr; month++) {
            System.out.println(month + " month: " + bodyPerMonth + " + " + percentPerMonth + " = " + (bodyPerMonth + percentPerMonth));
        }
        System.out.println("Total: " + summ + " + " + creditPercent + " = " + creditFull);
    }

    // б) Суммарное значение выплаченных процентов за период пользования кредитом.
    public static void fullCredit(double summ, int st, int sr) {
        System.out.println("Full Credit Percent: " + summ * st / 100);
    }

}
