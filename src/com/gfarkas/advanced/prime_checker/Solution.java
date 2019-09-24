package com.gfarkas.advanced.prime_checker;

import java.io.*;
import java.util.*;

import static java.lang.System.in;

import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Prime {

    static boolean isPrime(int number) {

        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(100);

    }

    static void checkPrime(int... input) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length; i++) {

            if (isPrime(input[i])) {

                result.append(input[i] + " ");

            }

        }

        System.out.println(result);

    }

}

public class Solution {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

