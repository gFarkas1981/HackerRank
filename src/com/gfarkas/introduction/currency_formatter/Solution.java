package com.gfarkas.introduction.currency_formatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale india = new Locale("en", "IN");

        NumberFormat usaLocale = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaLocale = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaLocale = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceLocale = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usaLocale.format(payment));
        System.out.println("India: " + indiaLocale.format(payment));
        System.out.println("China: " + chinaLocale.format(payment));
        System.out.println("France: " + franceLocale.format(payment));

    }
}
