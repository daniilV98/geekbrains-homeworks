package ru.geekbrains.lesson4;

public class Treadmill {

    private int trackLength;

    public Treadmill(int trackLength) {
        this.trackLength = trackLength;
    }

    public boolean human(Human human) {
        if (trackLength <= human.getRun()) {
            System.out.println("Человек " + human.getName() + " пробежал дорожку длиной " + trackLength + " м!");
            return true;
        } else {
            System.out.println("Человек " + human.getName() + " не пробежал дорожку длиной " + trackLength + " м!");
            System.out.println("Выбыл из участия!");
            return  false;
        }
    }

    public boolean cat(Cat cat) {
        if (trackLength <= cat.getRun()) {
            System.out.println("Кот " + cat.getName() + " пробежал дорожку длиной " + trackLength + " м!");
            return true;
        } else {
            System.out.println("Кот " + cat.getName() + " не пробежал дорожку длиной " + trackLength + " м!");
            System.out.println("Выбыл из участия!");
            return false;
        }
    }

    public boolean robot(Robot robot) {
        if (trackLength <= robot.getRun()) {
            System.out.println("Робот " + robot.getName() + " пробежал дорожку длиной " + trackLength + " м!");
            return true;
        } else {
            System.out.println("Робот " + robot.getName() + " не пробежал дорожку длиной " + trackLength + " м!");
            System.out.println("Выбыл из участия!");
            return false;
        }
    }
}
