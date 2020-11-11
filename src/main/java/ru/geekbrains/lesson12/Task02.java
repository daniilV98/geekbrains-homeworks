package ru.geekbrains.lesson12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task02 {

    static String[][] words ={
            {"Арбуз", "Банан", "Апельсин", "Мандарин", "Яблоко"}, {"Арбуз", "Банан", "Апельсин", "Мандарин", "Арбуз"},
            {"Арбуз", "Банан", "Апельсин", "Арбуз", "Банан"}, {"Арбуз", "Банан", "Арбуз", "Банан", "Апельсин"},
            {"Арбуз", "Виноград", "Банан", "Апельсин", "Мандарин"}
    };

    public static void main(String[] args) {

        List<String> str = Stream.of(words)
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Список уникальных слов: " + str);
    }
}
