package ru.geekbrains.lesson5.participant;

import ru.geekbrains.lesson5.participant.properties.Jumping;
import ru.geekbrains.lesson5.participant.properties.Running;

public class Robot extends Skills implements Running, Jumping {

    public Robot(String name, int jump, int run, boolean isSwim, boolean isFly, String typeParticipant) {
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
