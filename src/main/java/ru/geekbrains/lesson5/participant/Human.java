package ru.geekbrains.lesson5.participant;

import ru.geekbrains.lesson5.participant.properties.Jumping;
import ru.geekbrains.lesson5.participant.properties.Running;
import ru.geekbrains.lesson5.participant.properties.Swimming;

public class Human extends Skills implements Jumping, Running, Swimming {

    public Human(String name, int jump, int run, boolean isSwim, boolean isFly, String typeParticipant) {
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

    @Override
    public void swim() {
        System.out.println("Плавать");
    }
}
