package com.gfarkas.strings.string_reverse;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String answer = "Yes";

        for (int i = 0; i < A.length(); i++) {

            if (!A.substring(i, i + 1).equals(A.substring(A.length() - 1 - i, A.length() - i))) {

                answer = "No";

            }

        }

        System.out.println(answer);

    }
}

