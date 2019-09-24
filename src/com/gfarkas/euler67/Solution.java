package com.gfarkas.euler67;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int testCases;
        int numberOfRows;

        Scanner scanner = new Scanner(System.in);

        // First line contains , the number of testcases. For each testcase:
        testCases = scanner.nextInt();

        int[] resultArray = new int[testCases];   // one test case has one result

        for (int l = 0; l < testCases; l++) {   // iterating through test cases

            // Second line contains , the number of rows in the triangle.
            numberOfRows = scanner.nextInt();
            scanner.nextLine(); // typing enter after an integer

            int[][] rows = new int[numberOfRows][numberOfRows];     // creating 2d array for number-triangle

            for (int k = 0; k < numberOfRows; k++) {    // getting rows

                String row = scanner.nextLine();    // getting actual row
                String[] stringRowElements = row.split(" ");    // creating an array of actual row

                int size = stringRowElements.length;    // determining the size of actual row
                int[] intRowElements = new int[size];   // creating an array of integers with the same size

                for (int i = 0; i < size; i++) {

                    intRowElements[i] = Integer.parseInt(stringRowElements[i]); // converting an array of strings to
                    // an array of integers
                }

                // copying actual row array to rows array
                System.arraycopy(intRowElements, 0, rows[k], 0, intRowElements.length);

            }

            ArrayList<Integer> lastRowMax = new ArrayList<>();  // creating arraylist for the maximum values of last row

            for (int i = numberOfRows - 1; i >= 0; i--) {   // iterating through rows backwards

                int[] lastRow = rows[i];    // getting the last row

                if (i < numberOfRows - 1) {     // if it's not the very last row
                    // so we have maximum values

                    for (int k = 0; k < lastRow.length - 1; k++) {  // iterating through last row

                        lastRow[k] = lastRow[k] + lastRowMax.get(lastRowMax.size() - 1 - k);    // adding maximum values
                        // from former row

                    }

                }

                lastRowMax.clear();     // clearing array of maximum values

                for (int j = lastRow.length - 1; j > 0; j--) {      // iterating through last row backwards

                    lastRowMax.add(Math.max(lastRow[j], lastRow[j - 1]));   // adding maximum values of adjacent numbers

                }

                resultArray[l] = lastRow[0];   // getting the result and adding it to the array of results

            }


        }

        scanner.close();    // closing scanner

        for (int element : resultArray) {

            System.out.println(element);    // iterating through results to show them in new line

        }

    }
}

