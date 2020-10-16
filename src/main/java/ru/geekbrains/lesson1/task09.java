package ru.geekbrains.lesson1;

import java.util.Arrays;

public class task09 {

    public static void main(String[] args) {
        int[] Arr = {17,54,3,2,11,4,5,21,4,8,-9,1};
        int min = Arr[0];
        int max = Arr[0];
        for (int i=0;i<Arr.length; i++) {
            if (Arr[i] < min) {
                min = Arr[i];
            } if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        System.out.println(Arrays.toString(Arr));
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

}
