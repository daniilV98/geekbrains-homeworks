package ru.geekbrains.lesson1;

import java.util.Arrays;

public class task7 {

    public static void main(String[] args) {
        int[] Arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0;i<Arr.length; i++) {
            if (Arr[i] < 6) {
                Arr[i] = Arr[i] * 2;
            } else {
                Arr[i] = Arr[i];
            }
        }
        System.out.println(Arrays.toString(Arr));
    }

}
