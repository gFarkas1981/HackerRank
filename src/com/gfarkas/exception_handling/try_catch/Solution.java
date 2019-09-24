package com.gfarkas.exception_handling.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            scanner.nextLine();
            int y = scanner.nextInt();
            System.out.println(x / y);

        } catch (InputMismatchException e) {

            System.out.println(e.getClass().toString().substring(6));

        } catch (Exception e) {

            System.out.println(e);

        }

    }
}

