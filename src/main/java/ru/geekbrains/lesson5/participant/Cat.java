package ru.geekbrains.lesson5.participant;

import ru.geekbrains.lesson5.participant.properties.Jumping;
import ru.geekbrains.lesson5.participant.properties.Running;

public class Cat extends Skills implements Jumping, Running {

    public Cat(String name, int jump, int run, boolean isSwim, boolean isFly, String typeParticipant) {
        super(name, jump, run, isSwim, isFly, typeParticipant);
    }

    @Override
    public void jump() {
        System.out.println("Прыгать");
    }

    @Override
    public void run() {
        System.out.println("Бегать");
    }
}
