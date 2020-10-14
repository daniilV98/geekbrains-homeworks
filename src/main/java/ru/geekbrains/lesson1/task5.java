package ru.geekbrains.lesson1;

import java.util.Arrays;

public class task5 {

    public static void main(String[] args) {
        int[] Arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i=0;i<Arr.length; i++) {
            if (Arr[i] == 1) {
                Arr[i] = 0;
            } else {
                Arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(Arr));
    }

}
