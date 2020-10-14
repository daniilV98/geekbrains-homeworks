package ru.geekbrains.lesson1;

import java.util.Arrays;

public class task6 {

    public static void main(String[] args) {
        int[] Arr = new int[8];
        int j = 2;
        for (int i=0;i<Arr.length; i++, j=j+3) {
            Arr[i] = j;
        }
        System.out.println(Arrays.toString(Arr));
    }

}
