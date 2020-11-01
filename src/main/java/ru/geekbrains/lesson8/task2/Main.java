package ru.geekbrains.lesson8.task2;

public class Main {

    public static void main(String[] args) {

        Notebook nbook = new Notebook();
        nbook.addEntries("Бобков", "12345");
        nbook.addEntries("Иванов", "23456");
        nbook.addEntries("Сидоров", "34567");
        nbook.addEntries("Нестеров", "034567");
        nbook.addEntries("Петров", "45678");
        nbook.addEntries("Бобков", "56789");
        nbook.addEntries("Нестеров", "67890");
        nbook.addEntries("Нестеров", "78901");

        System.out.println("Номера Петрова: " + nbook.getLastName("Петров"));
        System.out.println("Номера Бобкова: " + nbook.getLastName("Бобков"));
        System.out.println("Номера Нестерова: " + nbook.getLastName("Нестеров"));
    }
}
