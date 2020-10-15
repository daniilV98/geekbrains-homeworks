package ru.geekbrains.lesson1;

public class task3 {

    static boolean lessThanZero(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(lessThanZero(3));
    }
}
