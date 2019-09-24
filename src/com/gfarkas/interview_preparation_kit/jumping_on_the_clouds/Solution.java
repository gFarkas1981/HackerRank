package com.gfarkas.interview_preparation_kit.jumping_on_the_clouds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    private static int jumpingOnClouds(int[] c) {

        int position = 0;
        int jumps = 0;

        while (position < c.length - 3) {   // it doesn't matter what will be the last jump 1 or 2

            if (c[position + 2] == 0) {     // if we can jump big

                position += 2;  // jump big

            } else {

                position += 1;  // jump small

            }


            jumps++;    //  making the last jump

        }

        jumps++;

        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        scanner.close();
        System.out.println(jumpingOnClouds(c));


    }
}
