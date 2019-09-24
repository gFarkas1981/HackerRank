package com.gfarkas.introduction.loops_2;

import java.util.Scanner;

class Solution {

    public static void main(String[] argh) {

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();   // number of queries

        while (q < 0 || q > 500) {

            q = scanner.nextInt();

        }

        for (int i = 0; i < q; i++) {

            int a = scanner.nextInt();

            int b = scanner.nextInt();

            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {

                a += b * (int) Math.pow(2, j);

                System.out.print(a + " ");

            }

            System.out.println();

        }

        scanner.close();

    }
}

