package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {
        int[] arr = {34, -54, 79, -2, -3, 35, 83, 90, -39, -76, 12, 43, 0, 11};

        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSort = false;
                   int number = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = number;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
