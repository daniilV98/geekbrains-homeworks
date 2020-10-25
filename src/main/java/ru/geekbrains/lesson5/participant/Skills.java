package ru.geekbrains.lesson5.participant;

public class Skills {

    private final String name;
    private final int jump;
    private final int run;
    private final boolean isSwim;
    private final boolean isFly;
    private final String typeParticipant;

    public Skills(String name, int jump, int run, boolean isSwim, boolean isFly, String typeParticipant) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        this.isSwim = isSwim;
        this.isFly = isFly;
        this.typeParticipant = typeParticipant;
    }

    public String getName() {
        return name;
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public boolean isFly() {
        return isFly;
    }

    public String getType() {
        return typeParticipant;
    }
}
