package com.gfarkas.introduction.loops_1;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = 0;

        boolean check = false;

        while (!check) {

            N = scanner.nextInt();

            if (N >= 2 && N <= 20) {

                check = true;

            }

        }

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {

            System.out.println(N + " x " + i + " = " + N * i);

        }

        scanner.close();
    }

}
