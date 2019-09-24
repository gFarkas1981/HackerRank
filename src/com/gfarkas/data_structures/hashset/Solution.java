package com.gfarkas.data_structures.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();


        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {

            pair_left[i] = s.next();
            pair_right[i] = s.next();


        }

        int uniquePair = 0;

        HashSet<String> pairsOfString = new HashSet<>();

        for (int i = 0; i < t; i++) {

            if (pairsOfString.add(pair_left[i] + " " + pair_right[i])) {

                uniquePair++;

            }

            System.out.println(uniquePair);

        }

    }
}