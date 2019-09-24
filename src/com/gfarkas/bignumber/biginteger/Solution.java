package com.gfarkas.bignumber.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(0);

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("[0-9]+")) {

            scanner.next();

        }

        a = scanner.nextBigInteger();

        while (!scanner.hasNext("[0-9]+")) {

            scanner.next();

        }

        b = scanner.nextBigInteger();


        System.out.println(a.add(b));
        System.out.println(a.multiply(b));


    }
}

