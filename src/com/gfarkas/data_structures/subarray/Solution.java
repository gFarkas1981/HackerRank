package com.gfarkas.data_structures.subarray;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] mainArray = new int[n];

        for (int i = 0; i < n; i++) {

            mainArray[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(negativeSubarrays(mainArray));
    }

    private static int negativeSubarrays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}