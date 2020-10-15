package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task05 {

    public static void main(String[] args) {
        int[] arr = {11, 5, 2, 10, 34, 56, 99};
        Random rnd = new Random();
        for (int i=1; i< arr.length; i++) {
            int k = rnd.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
