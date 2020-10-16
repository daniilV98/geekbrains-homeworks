package ru.geekbrains.lesson1;

public class task01 {

    static boolean lessThan(int a, int b) {
        int c = a + b;

        if (10 <= c && c <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(lessThan(-1,11));
    }
}
