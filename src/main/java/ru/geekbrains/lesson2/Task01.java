package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {

        int height = 10;
        for (int i = 0; i < height; i++){

            for (int k = height; k > i; k--){
                System.out.print(" ");
            }
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("*");
            }
            for (int j2 = 0; j2 < i; j2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
