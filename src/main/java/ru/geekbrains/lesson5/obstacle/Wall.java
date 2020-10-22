package ru.geekbrains.lesson5.obstacle;

import ru.geekbrains.lesson5.participant.*;

public class Wall {

    private final int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public boolean human(Human human) {
        if (wallHeight <= human.getJump()) {
            System.out.println("Человек " + human.getName() + " перепрыгнул стену высотой " + wallHeight + " м!");
            return true;
        } else {
            System.out.println("Человек " + human.getName() + " не перепрыгнул стену высотой " + wallHeight + " м!");
            System.out.println("Человек " + human.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean cat(Cat cat) {
        if (wallHeight <= cat.getJump()) {
            System.out.println("Кот " + cat.getName() + " перепрыгнул стену высотой " + wallHeight + " м!");
            return true;
        } else {
            System.out.println("Кот " + cat.getName() + " не перепрыгнул стену высотой " + wallHeight + " м!");
            System.out.println("Кот " + cat.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean robot(Robot robot) {
        if (wallHeight <= robot.getJump()) {
            System.out.println("Робот " + robot.getName() + " перепрыгнул стену высотой " + wallHeight + " м!");
            return true;
        } else {
            System.out.println("Робот " + robot.getName() + " не перепрыгнул стену высотой " + wallHeight + " м!");
            System.out.println("Робот " + robot.getName() + " выбыл из участия");
            return false;
        }
    }

    public boolean bird(Bird bird) {
        if (wallHeight <= bird.getJump()) {
            System.out.println("Птица " + bird.getName() + " перепрыгнула стену высотой " + wallHeight + " м!");
            return true;
        } else {
            System.out.println("Птица " + bird.getName() + " не перепрыгнула стену высотой " + wallHeight + " м!");
            System.out.println("Птица " + bird.getName() + " выбыла из участия");
            return false;
        }
    }

    public boolean fish(Fish fish) {
        if (wallHeight <= fish.getJump()) {
            System.out.println("Рыба " + fish.getName() + " перепрыгнула стену высотой " + wallHeight + " м!");
            return true;
        } else {
            System.out.println("Рыба " + fish.getName() + " не перепрыгнула стену высотой " + wallHeight + " м!");
            System.out.println("Рыба " + fish.getName() + " выбыла из участия");
            return false;
        }
    }
}
