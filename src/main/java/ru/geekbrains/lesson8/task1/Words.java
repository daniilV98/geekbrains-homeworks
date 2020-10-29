package ru.geekbrains.lesson8.task1;

import java.util.*;

public class Words {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
                "Машина", "Самолет", "Мотоцикл", "Машина", "Машина",
                "Машина", "Машина", "Мотоцикл", "Самокат", "Велосипед",
                "Машина", "Скейтборд", "Мотоцикл", "Машина", "Велосипед"
        ));
        System.out.println("Список слов = " + words);

        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Список уникальных слов = " + uniqueWords);

        HashMap<String, Integer> repeatWords = new HashMap<>();
        Integer repeatWord;
        for (String word : words) {
            repeatWord = repeatWords.get(word);
            repeatWords.put(word, repeatWord == null ? 1 : repeatWord + 1);
        }
        System.out.println("Подсчет повторяющихся слов: " + repeatWords);
    }
}
