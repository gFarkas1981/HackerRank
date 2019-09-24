package com.gfarkas.artificial_intelligence.bot_building.bot_clean;

import java.util.Scanner;

public class Solution {

    private static void nextMove(int botX, int botY, String[] grid) {

        int n = grid.length;

        int maxX = -1;
        int maxY = -1;
        int maxValue = 0;

        String[][] nodes = new String[n][n];
        int[][] intNodes = new int[n][n];

        for (int i = 0; i < n; i++) {

            nodes[i] = grid[i].split("");

        }


        for (int x = 0; x < n; x++) {

            for (int y = 0; y < n; y++) {

                int prize = 12;

                if (nodes[x][y].equals("b")) {

                    intNodes[x][y] = 0;

                } else {

                    intNodes[x][y] = Math.abs(botX - x) + Math.abs(botY - y) / 2;

                    for (int i = x; i >= 0; i--) {

                        if (nodes[i][y].equals("d")) {

                            intNodes[x][y] += prize;

                        }

                    }

                    for (int i = x; i < n; i++) {

                        if (nodes[i][y].equals("d")) {

                            intNodes[x][y] += prize;

                        }

                    }

                    for (int i = y; i >= 0; i--) {

                        if (nodes[x][i].equals("d")) {

                            intNodes[x][y] += prize;

                        }

                    }

                    for (int i = y; i < n; i++) {

                        if (nodes[x][i].equals("d")) {

                            intNodes[x][y] += prize;

                        }

                    }

                }

                System.out.println(intNodes[x][y]);

                if (intNodes[x][y] > maxValue) {

                    maxValue = intNodes[x][y];
                    maxX = x;
                    maxY = y;

                }


            }

        }

        if (nodes[botX][botY].equals("d")) {

            System.out.println("CLEAN");

        } else if (maxY > botY) {

            System.out.println("RIGHT");

        } else if (maxY < botY) {

            System.out.println("LEFT");

        } else if (maxX > botX) {

            System.out.println("DOWN");

        } else if (maxX < botX) {

            System.out.println("UP");

        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int botX, botY;

        botX = in.nextInt();
        botY = in.nextInt();
        in.useDelimiter("\n");
        String[] grid = new String[5];


        for (int i = 0; i < 5; i++) {

            grid[i] = in.next();

        }

        nextMove(botX, botY, grid);

    }
}