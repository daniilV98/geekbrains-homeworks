package ru.geekbrains.lesson5.obstacle;

import ru.geekbrains.lesson5.participant.*;

public class Abyss {

    public boolean human(Human human) {
        if(human.isFly()) {
            System.out.println("Человек " + human.getName() + " перелетел пропасть");
            return true;
        } else {
            System.out.println("Человек " + human.getName() + " не перелетел пропасть");
            System.out.println("Человек " + human.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean cat(Cat cat) {
        if(cat.isFly()) {
            System.out.println("Кот " + cat.getName() + " перелетел пропасть");
            return true;
        } else {
            System.out.println("Кот " + cat.getName() + " не перелетел пропасть");
            System.out.println("Кот " + cat.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean robot(Robot robot) {
        if(robot.isFly()) {
            System.out.println("Робот " + robot.getName() + " перелетел пропасть");
            return true;
        } else {
            System.out.println("Робот " + robot.getName() + " не перелетел пропасть");
            System.out.println("Робот " + robot.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean bird(Bird bird) {
        if(bird.isFly()) {
            System.out.println("Птица " + bird.getName() + " перелетела пропасть");
            return true;
        } else {
            System.out.println("Птица " + bird.getName() + " не перелетела пропасть");
            System.out.println("Птица " + bird.getName() + " выбыла из участия");
            return false;
        }
    }

    public boolean fish(Fish fish) {
        if(fish.isFly()) {
            System.out.println("Рыба " + fish.getName() + " перелетела пропасть");
            return true;
        } else {
            System.out.println("Рыба " + fish.getName() + " не перелетела пропасть");
            System.out.println("Рыба " + fish.getName() + " выбыла из участия");
            return false;
        }
    }
}
