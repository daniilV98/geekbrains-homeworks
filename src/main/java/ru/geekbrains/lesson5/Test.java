package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.participant.*;

public class Test {

    private static final boolean FALSE = false;
    private static final boolean TRUE = true;

    public static void main(String[] args) {
        Object[] participants = new Object[5];
        participants[0] = new Human("Rob", 2,20,TRUE,FALSE,"Человек");
        participants[1] = new Cat("Max",3,15,FALSE,FALSE,"Кот");
        participants[2] = new Robot("Ben",4,10,FALSE,FALSE, "Робот");
        participants[3] = new Bird("Ellie",0,0,FALSE,TRUE,"Птица");
        participants[4] = new Fish("Nemo",0,0,TRUE,FALSE,"Рыба");

        int[] obstacles = new int[2];
        obstacles[0] = 2;
        obstacles[1] = 15;
        OvercomingObstacles overcomingObstacles = new OvercomingObstacles(obstacles[0], obstacles[1]);

        for (Object participant : participants) {
            if (participant instanceof Human) {
                Human human = (Human) participant;
                overcomingObstacles.goOvercomingObstaclesHuman(human);
            } else if (participant instanceof Cat){
                Cat cat = (Cat) participant;
                overcomingObstacles.goOvercomingObstaclesCat(cat);
            } else if (participant instanceof Robot){
                Robot robot = (Robot) participant;
                overcomingObstacles.goOvercomingObstaclesRobot(robot);
            } else if (participant instanceof Bird){
                Bird bird = (Bird) participant;
                overcomingObstacles.goOvercomingObstaclesBird(bird);
            } else if (participant instanceof Fish){
                Fish fish = (Fish) participant;
                overcomingObstacles.goOvercomingObstaclesFish(fish);
            }
        }
        System.out.println();
        overcomingObstacles.showAllPropertiesParticipant(participants);
    }
}
