package ru.geekbrains.lesson5.obstacle;

import ru.geekbrains.lesson5.participant.*;

public class Pool {

    public boolean human(Human human) {
        if(human.isSwim()) {
            System.out.println("Человек " + human.getName() + " переплыл бассейн");
            return true;
        } else {
            System.out.println("Человек " + human.getName() + " не переплыл бассейн");
            System.out.println("Человек " + human.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean cat(Cat cat) {
        if(cat.isSwim()) {
            System.out.println("Кот " + cat.getName() + " переплыл бассейн");
            return true;
        } else {
            System.out.println("Кот " + cat.getName() + " не переплыл бассейн");
            System.out.println("Кот " + cat.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean robot(Robot robot) {
        if(robot.isSwim()) {
            System.out.println("Робот " + robot.getName() + " переплыл бассейн");
            return true;
        } else {
            System.out.println("Робот " + robot.getName() + " не переплыл бассейн");
            System.out.println("Робот " + robot.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean bird(Bird bird) {
        if(bird.isSwim()) {
            System.out.println("Птица " + bird.getName() + " переплыла бассейн");
            return true;
        } else {
            System.out.println("Птица " + bird.getName() + " не переплыла бассейн");
            System.out.println("Птица " + bird.getName() + " выбыла из участия");
            return false;
        }
    }

    public boolean fish(Fish fish) {
        if(fish.isSwim()) {
            System.out.println("Рыба " + fish.getName() + " переплыла бассейн");
            return true;
        } else {
            System.out.println("Рыба " + fish.getName() + " не переплыла бассейн");
            System.out.println("Рыба " + fish.getName() + " выбыла из участия");
            return false;
        }
    }
}
