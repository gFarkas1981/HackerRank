package com.gfarkas.interview_preparation_kit.counting_valleys;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the countingValleys function below.
    private static int countingValleys(int n, String s) {

        int numberOfValleys = 0;
        int elevation = 0;

        for (char c : s.toCharArray()) {

            if (c == 'U') ++elevation;
            if (c == 'D') --elevation;

            // if we just came UP to sea level
            if (elevation == 0 && c == 'U')
                ++numberOfValleys;

        }

        return numberOfValleys;

    }

    public static void main(String[] args) {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        scanner.close();
    }
}
