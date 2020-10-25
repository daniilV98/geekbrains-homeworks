package ru.geekbrains.lesson5.participant;

import ru.geekbrains.lesson5.participant.properties.Flying;

public class Bird extends Skills implements Flying {

    public Bird(String name, int jump, int run, boolean isSwim, boolean isFly, String typeParticipant) {
        super(name, jump, run, isSwim, isFly, typeParticipant);
    }

    @Override
    public void fly() {
        System.out.println("Летать");
    }
}
