package com.gfarkas.introduction.static_initializer_block;

import java.util.Scanner;

public class Solution {

    private static int B;
    private static int H;
    private static boolean flag = false;

    static {

        Scanner scanner = new Scanner(System.in);

        B = scanner.nextInt();
        H = scanner.nextInt();

        flag = B > 0 && H > 0;

        if (!flag) {

            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }

        scanner.close();

    }

    public static void main(String[] args) {

        if (flag) {

            System.out.print(B * H);

        }
    }

}
