package ru.geekbrains.lesson1;

public class task10 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
