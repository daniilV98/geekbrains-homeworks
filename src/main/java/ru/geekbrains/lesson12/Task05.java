package ru.geekbrains.lesson12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task05 {

    static String[] words = {

            "Арбуз", "Банан", "Апельсин", "Мандарин", "Яблоко", "Виноград" };

    public static void main(String[] args) {

        List<String> str = Stream.of(words)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Первые три слова в алфавитном порядке: " + str);
    }
}
