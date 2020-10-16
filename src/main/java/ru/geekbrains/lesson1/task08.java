package ru.geekbrains.lesson1;

import java.util.Arrays;

public class task08 {

    public static void main(String[] args) {
        int[][] square = new int[5][5];
        fillDiags(square);

        for (int[] line : square) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void fillDiags(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j) {
                    square[i][j] = 1;
                }
            }
        }
    }
}
