package ru.geekbrains.lesson5.obstacle;

import ru.geekbrains.lesson5.participant.*;

public class Treadmill {

    private final int trackLength;

    public Treadmill(int trackLength) {
        this.trackLength = trackLength;
    }

    public boolean human(Human human) {
        if (trackLength <= human.getRun()) {
            System.out.println("Человек " + human.getName() + " пробежал дорожку длиной " + trackLength + " м!");
            return true;
        } else {
            System.out.println("Человек " + human.getName() + " не пробежал дорожку длиной " + trackLength + " м!");
            System.out.println("Человек " + human.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean cat(Cat cat) {
        if (trackLength <= cat.getRun()) {
            System.out.println("Кот " + cat.getName() + " пробежал дорожку длиной " + trackLength + " м!");
            return true;
        } else {
            System.out.println("Кот " + cat.getName() + " не пробежал дорожку длиной " + trackLength + " м!");
            System.out.println("Кот " + cat.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean robot(Robot robot) {
        if (trackLength <= robot.getRun()) {
            System.out.println("Робот " + robot.getName() + " пробежал дорожку длиной " + trackLength + " м!");
            return true;
        } else {
            System.out.println("Робот " + robot.getName() + " не пробежал дорожку длиной " + trackLength + " м!");
            System.out.println("Робот " + robot.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean bird(Bird bird) {
        if (trackLength <= bird.getRun()) {
            System.out.println("Птица " + bird.getName() + " пробежала дорожку длиной " + trackLength + " м!");
            return true;
        } else {
            System.out.println("Птица " + bird.getName() + " не пробежала дорожку длиной " + trackLength + " м!");
            System.out.println("Птица " + bird.getName() + " выбыла из участия");
            return false;
        }
    }

    public boolean fish(Fish fish) {
        if (trackLength <= fish.getRun()) {
            System.out.println("Рыба " + fish.getName() + " пробежала дорожку длиной " + trackLength + " м!");
            return true;
        } else {
            System.out.println("Рыба " + fish.getName() + " не пробежала дорожку длиной " + trackLength + " м!");
            System.out.println("Рыба " + fish.getName() + " выбыла из участия");
            return false;
        }
    }
}
