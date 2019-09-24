package com.gfarkas.data_structures.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    private static ArrayList<String> L = new ArrayList<>();

    private static void insert(String position, String value) {

        L.add(Integer.parseInt(position), value);

    }

    private static void delete(String position) {

        L.remove(Integer.parseInt(position));

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        String[] temp = scan.nextLine().split(" ");

        Collections.addAll(L, temp);

        int Q = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < Q; i++) {

            String operation = scan.nextLine();
            String[] parameters = scan.nextLine().split(" ");

            if (operation.equals("Insert")) {

                insert(parameters[0], parameters[1]);

            } else {

                delete(parameters[0]);

            }

        }

        for (String element : L) {

            System.out.print(element + " ");

        }

    }
}

