package com.gfarkas.strings.substring_comparisons;


import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";

        String[] portions = new String[s.length() - k + 1];

        for (int i = 0; i < s.length() - k + 1; i++) {

            portions[i] = s.substring(i, i + k);

        }


        int j;
        boolean flag = true;  // will determine when the sort is finished
        String temp;

        while (flag) {

            flag = false;

            for (j = 0; j < portions.length - 1; j++) {

                if (portions[j].compareTo(portions[j + 1]) > 0) {     // ascending sort

                    temp = portions[j];
                    portions[j] = portions[j + 1];  // swapping
                    portions[j + 1] = temp;
                    flag = true;

                }

            }

        }

        smallest = portions[0];
        largest = portions[portions.length - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}

