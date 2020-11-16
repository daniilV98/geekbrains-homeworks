package ru.geekbrains.lesson12;

import java.util.Arrays;

public class Task04 {

    static String[] sumLineLength = {
            "Профессорская дача на берегу Финского залива"
    };

    public static void main(String[] args) {

        int str = Arrays.stream(sumLineLength)
                .mapToInt(String::length)
                .sum();
        System.out.println("Суммарная длина строк: = " + str);
    }
}
