package com.gfarkas.advanced.lambda_expressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    static boolean checker(PerformOperation p, int num) {

        return p.check(num);

    }

    static PerformOperation isOdd() {

        return (int a) -> a % 2 != 0;

    }

    static PerformOperation isPrime() {

        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);

    }

    public static PerformOperation isPalindrome() {

        return (int a) -> Integer.toString(a).
                equals(new StringBuilder(Integer.toString(a)).reverse().toString());

    }

}

public class Solution {

    public static void main(String[] args) throws IOException {

        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = MyMath.isOdd();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = MyMath.isPrime();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = MyMath.isPalindrome();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
