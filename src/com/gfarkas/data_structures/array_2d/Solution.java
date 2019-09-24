package com.gfarkas.data_structures.array_2d;

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        int maxSum = 0;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {

                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;

                if (arrItem * -36 < maxSum) {

                    maxSum = arrItem * -36;

                }

            }
        }

        scanner.close();

        for (int l = 0; l < 4; l++) {

            for (int m = 0; m < 4; m++) {

                int sum = 0;
                sum += arr[l][m];
                sum += arr[l][m + 1];
                sum += arr[l][m + 2];

                sum += arr[l + 1][m + 1];

                sum += arr[l + 2][m];
                sum += arr[l + 2][m + 1];
                sum += arr[l + 2][m + 2];

                if (sum > maxSum) {

                    maxSum = sum;

                }


            }

        }

        System.out.println(maxSum);

    }
}
