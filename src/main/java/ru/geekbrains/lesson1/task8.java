package ru.geekbrains.lesson1;

import java.util.Arrays;

public class task8 {

    public static void main(String[] args) {
        int[][] square = new int[5][5];
        int a = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square[0][0] = a;
                square[1][1] = a;
                square[2][2] = a;
                square[3][3] = a;
                square[4][4] = a;
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
