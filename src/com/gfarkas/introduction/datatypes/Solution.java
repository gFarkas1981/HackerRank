package com.gfarkas.introduction.datatypes;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            try {

                long x = scanner.nextLong();

                System.out.println(x + " can be fitted in:");

                if (x >= -128 && x <= 127)
                    System.out.println("* byte");

                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");

                if (x >= -2147483648 && x <= 2147483647)
                    System.out.println("* int");

                System.out.println("* long");

                System.out.println();
            } catch (Exception e) {

                System.out.println(scanner.next() + " can't be fitted anywhere.");

            }

        }
    }
}
