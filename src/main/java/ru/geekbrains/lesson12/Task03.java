package ru.geekbrains.lesson12;

import java.util.stream.IntStream;

public class Task03 {

    public static void main(String[] args) {
        int rangedIntStream = IntStream.rangeClosed(100, 200)
                .filter(item -> item % 2 == 0)
                .sum();
        System.out.println("Сумма четных чисел: = " + rangedIntStream);
    }
}
