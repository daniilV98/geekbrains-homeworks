package ru.geekbrains.lesson4;

public class Human {

    private int jump;
    private int run;
    private String name;

    public Human(int jump, int run, String name) {
        this.jump = jump;
        this.run = run;
        this.name = name;
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return "Человек";
    }
}
