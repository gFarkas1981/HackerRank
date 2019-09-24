package com.gfarkas.interview_preparation_kit.sock_merchant;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        System.out.println(sockMerchant(10, ar));

    }

    // Complete the sockMerchant function below.
    private static int sockMerchant(int n, int[] ar) {

        int count = 0;
        Arrays.sort(ar);

        for (int i = 0; i < n - 1; i++) {

            if (ar[i] == ar[i + 1]) {

                count = count + 1;
                i = i + 1;


            }

        }

        return count;

    }

}
