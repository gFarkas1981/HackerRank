package com.gfarkas.artificial_intelligence.bot_building.bot_saves_princess;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int N = Integer.parseInt(in.nextLine());
        final char[][] GRID = new char[N][N];

        for (int i = 0; i < N; i++) {

            String row = in.nextLine();
            GRID[i] = (row.trim()).toCharArray();

        }

        displayPathtoPrincess(N, GRID);

    }

    private static void displayPathtoPrincess(int N, char[][] GRID) {

        int[] posPrincess = new int[2];
        int[] posBot = new int[2];

        for (int y = 0; y < N; y++) {   // 2. then iterating through actual column

            for (int x = 0; x < N; x++) {   // 1. first iterating through actual row

                if (GRID[x][y] == 'p') {    //  princess is at actual position

                    posPrincess[0] = x;     //  storing princess' position
                    posPrincess[1] = y;

                }

                if (GRID[y][x] == 'm') {    //  bot is at actual position

                    posBot[0] = x;  //  storing bot's position
                    posBot[1] = y;

                }

            }

        }

        while (posBot[0] != posPrincess[0] && posBot[1] != posPrincess[1]) {

            if (posBot[0] > posPrincess[0]) {   // under princess

                posBot[0] = posBot[0] + 1;  // move up
                System.out.println("UP");

            } else {   // over princess

                posBot[0] = posBot[0] + 1;  // move down
                System.out.println("DOWN");

            }

            if (posBot[1] > posPrincess[1]) {   // right from princess

                posBot[1] = posBot[1] - 1;  // move left
                System.out.println("LEFT");

            }
            if (posBot[1] < posPrincess[1]) {   // left from princess

                posBot[1] = posBot[1] + 1;  // move right
                System.out.println("RIGHT");

            }

        }

    }

}


