package com.gfarkas.strings.anagrams;

import java.util.Scanner;

public class Solution {

    private static boolean isAnagram(String a, String b) {

        boolean isAnagram = false;

        // Cleaning the strings (remove white spaces and convert to lowercase)
        a = a.replaceAll("\\s+", "").toLowerCase();
        b = b.replaceAll("\\s+", "").toLowerCase();

        if (a.length() == b.length()) {
            //they could be anagrams if they have the same length

            // Check every char of String a and removes first occurrence of it in String b
            for (int i = 0; i < a.length(); i++) {

                if (b.equals("")) return false;
                // String b is already empty So it is not an anagram
                b = b.replaceFirst(String.valueOf(a.charAt(i)), "");

            }

            // if String b is empty we have an anagram
            isAnagram = b.equals("");

        }

        return isAnagram;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}