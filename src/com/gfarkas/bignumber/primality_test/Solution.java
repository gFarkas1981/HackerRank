package com.gfarkas.bignumber.primality_test;

import java.math.*;
import java.util.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        if (new BigInteger(n).isProbablePrime(1)) {

            System.out.println("prime");

        } else {

            System.out.println("not prime");

        }

        scanner.close();
    }
}
