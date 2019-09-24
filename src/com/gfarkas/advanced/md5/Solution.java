package com.gfarkas.advanced.md5;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(inputString.getBytes());
            byte[] digest = md.digest();

            for (byte b : digest) System.out.printf("%02x", b);

        } catch (Exception e) {
        }

    }

}


