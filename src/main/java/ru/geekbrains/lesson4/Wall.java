package ru.geekbrains.lesson4;

public class Wall {

    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public boolean human(Human human) {
        if (wallHeight <= human.getJump()) {
            System.out.println("Человек " + human.getName() + " перепрыгнул стену высотой " + wallHeight + " м!");
            return true;
        } else {
            System.out.println("Человек " + human.getName() + " не перепрыгнул стену высотой " + wallHeight + " м!");
            System.out.println("Выбыл из участия!");
            return false;
        }
    }

    public boolean cat(Cat cat) {
        if (wallHeight <= cat.getJump()) {
            System.out.println("Кот " + cat.getName() + " перепрыгнул стену высотой " + wallHeight + " м!");
            return true;
        } else {
            System.out.println("Кот " + cat.getName() + " не перепрыгнул стену высотой " + wallHeight + " м!");
            System.out.println("Выбыл из участия!");
            return  false;
        }
    }

    public boolean robot(Robot robot) {
        if (wallHeight <= robot.getJump()) {
            System.out.println("Робот " + robot.getName() + " перепрыгнул стену высотой " + wallHeight + " м!");
            return true;
        } else {
            System.out.println("Робот " + robot.getName() + " не перепрыгнул стену высотой " + wallHeight + " м!");
            System.out.println("Выбыл из участия!");
            return false;
        }
    }
}
