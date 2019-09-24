package com.gfarkas.data_structures.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

    public static void main(String[] arg) {

        Map<String, Integer> phoneBook = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            scanner.nextLine();
            phoneBook.put(name, phone);

        }

        while (scanner.hasNextLine()) {

            String s = scanner.nextLine();
            if (phoneBook.containsKey(s)) {

                System.out.println(s + "=" + phoneBook.get(s));

            } else {

                System.out.println("Not found");

            }

        }

        scanner.close();

    }

}



