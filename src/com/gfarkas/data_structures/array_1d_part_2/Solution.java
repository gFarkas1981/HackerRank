package com.gfarkas.data_structures.array_1d_part_2;

import java.util.*;

public class Solution {

    private static boolean canWin(int leap, int[] game) {

        return couldWin(leap, game, 0);

    }

    private static boolean couldWin(int leap, int[] game, int actualPosition) {

        // Base Cases
        if (actualPosition < 0 || game[actualPosition] == 1) {
            //if actual position is negative or we've been already on this position
            return false;

        } else if (actualPosition + 1 >= game.length || actualPosition + leap >= game.length) {
            // if we can step or leap from this position to array's last element or beyond of array's last element
            return true;

        }

        game[actualPosition] = 1; // marking actual position as visited

        /* Recursive Cases (Tries +m first to try to finish game quickly) */
        return couldWin(leap, game, actualPosition + leap)
                || couldWin(leap, game, actualPosition + 1)
                || couldWin(leap, game, actualPosition - 1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}

