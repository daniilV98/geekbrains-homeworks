package ru.geekbrains.lesson5.participant;

import ru.geekbrains.lesson5.participant.properties.Swimming;

public class Fish extends Skills implements Swimming {

    public Fish(String name, int jump, int run, boolean isSwim, boolean isFly, String typeParticipant) {
        super(name, jump, run, isSwim, isFly, typeParticipant);
    }

    @Override
    public void swim() {
        System.out.println("Плавать");
    }
}
