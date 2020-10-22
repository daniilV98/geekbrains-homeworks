package ru.geekbrains.lesson4;

public class Test {

    public static void main(String[] args) {
        Object[] participants = new Object[3];
        participants[0] = new Human(2, 20, "Rob");
        participants[1] = new Cat(3, 15, "Max");
        participants[2] = new Robot(1, 25, "Ben");

        int[] obstacles = new int[2];
        obstacles[0] = 2;
        obstacles[1] = 19;
        OvercomingObstacles overcomingObstacles = new OvercomingObstacles(obstacles[0], obstacles[1]);

        for (Object participant : participants) {
            if (participant.getClass().getName().contains("Human")) {
                Human human = (Human) participant;
                overcomingObstacles.goOvercomingObstaclesHuman(human);
            } else if (participant.getClass().getName().contains("Cat")) {
                Cat cat = (Cat) participant;
                overcomingObstacles.goOvercomingObstaclesCat(cat);
            } else if (participant.getClass().getName().contains("Robot")) {
                Robot robot = (Robot) participant;
                overcomingObstacles.goOvercomingObstaclesRobot(robot);
            }
        }
    }
}
