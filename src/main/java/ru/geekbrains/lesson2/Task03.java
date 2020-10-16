package ru.geekbrains.lesson2;

public class Task03 {

    public static void main(String[] args) {

        convertSeconds(86399);
    }
    public static void convertSeconds(long sec) {
        long seconds = sec % 60;
        long minutes = sec % 3600/60;
        long hours = sec % 86400/3600;
        System.out.println("Конвертация секунд = " + hours + "ч:" + minutes + "м:" + seconds + "с");
    }
}
