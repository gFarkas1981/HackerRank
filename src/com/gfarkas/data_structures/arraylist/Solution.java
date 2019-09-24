package com.gfarkas.data_structures.arraylist;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList[] matrix = new ArrayList[n];


        // initializing
        for (int i = 0; i < n; i++) {

            String[] actualRow = scanner.nextLine().split(" ");

            matrix[i] = new ArrayList<String>();

            for (String element : actualRow) {

                matrix[i].add(element);

            }

        }

        int q = scanner.nextInt();
        scanner.nextLine();

        // initializing
        for (int i = 0; i < q; i++) {

            String[] coordinates = scanner.nextLine().split(" ");

            try {

                System.out.println(matrix[Integer.parseInt(coordinates[0]) - 1].get(Integer.parseInt(coordinates[1])));

            } catch (Exception e) {

                System.out.println("ERROR!");

            }


        }


    }
}
