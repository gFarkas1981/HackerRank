package com.gfarkas.introduction.end_of_file;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i = 1;

        while (scanner.hasNextLine()) {

            System.out.println(i + " " + scanner.nextLine());
            i++;

        }

        scanner.close();
    }
}
