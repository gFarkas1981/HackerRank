package com.gfarkas.artificial_intelligence.bot_building.bot_saves_princess_2;

import java.util.Scanner;

public class Solution {

    private static void nextMove(int n, int r, int c, String[] grid) {

        int princessX = 0;
        int princessY = 0;

        for (int i = 0; i < n; i++) {

            if (grid[i].contains("p")) {

                princessX = i;
                princessY = grid[i].indexOf("p");

            }

        }

        int vectorX = princessX - r;
        int vectorY = princessY - c;

        if (vectorX > 0) {

            System.out.println("DOWN");

        } else if (vectorX < 0) {

            System.out.println("UP");

        } else if (vectorY > 0) {

            System.out.println("RIGHT");

        } else {

            System.out.println("LEFT");

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r, c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String[] grid = new String[n];


        for (int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n, r, c, grid);

    }
}