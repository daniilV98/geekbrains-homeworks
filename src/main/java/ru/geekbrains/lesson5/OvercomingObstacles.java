package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.obstacle.Abyss;
import ru.geekbrains.lesson5.obstacle.Pool;
import ru.geekbrains.lesson5.obstacle.Treadmill;
import ru.geekbrains.lesson5.obstacle.Wall;
import ru.geekbrains.lesson5.participant.*;
import ru.geekbrains.lesson5.participant.properties.Flying;
import ru.geekbrains.lesson5.participant.properties.Jumping;
import ru.geekbrains.lesson5.participant.properties.Running;
import ru.geekbrains.lesson5.participant.properties.Swimming;

public class OvercomingObstacles {

    private final Wall wall;
    private final Treadmill treadmill;
    private final Pool pool;
    private final Abyss abyss;

    public OvercomingObstacles(int wallHeight, int trackLength) {
        wall = new Wall(wallHeight);
        treadmill = new Treadmill(trackLength);
        pool = new Pool();
        abyss = new Abyss();
    }

    public void goOvercomingObstaclesHuman(Human human) {
        int count = 0;
        boolean completeFirstOvercomingObstacles;
        boolean completeSecondOvercomingObstacles = false;
        boolean completeThirdOvercomingObstacles = false;
        boolean completeFourthOvercomingObstacles = false;
        System.out.println();
        completeFirstOvercomingObstacles = wall.human(human);
        if (completeFirstOvercomingObstacles) {
            count++;
            completeSecondOvercomingObstacles = treadmill.human(human);
        }
        if (completeSecondOvercomingObstacles) {
            count++;
            completeThirdOvercomingObstacles = pool.human(human);
        }
        if (completeThirdOvercomingObstacles) {
            count++;
            completeFourthOvercomingObstacles = abyss.human(human);
        }
        if (completeFourthOvercomingObstacles) {
            count++;
            showInfoParticipants(count, human.getType(), human.getName());
        }
    }

    public void goOvercomingObstaclesCat(Cat cat) {
        int count = 0;
        boolean completeFirstOvercomingObstacles;
        boolean completeSecondOvercomingObstacles = false;
        boolean completeThirdOvercomingObstacles = false;
        boolean completeFourthOvercomingObstacles = false;
        System.out.println();
        completeFirstOvercomingObstacles = wall.cat(cat);
        if (completeFirstOvercomingObstacles) {
            count++;
            completeSecondOvercomingObstacles = treadmill.cat(cat);
        }
        if (completeSecondOvercomingObstacles) {
            count++;
            completeThirdOvercomingObstacles = pool.cat(cat);
        }
        if (completeThirdOvercomingObstacles) {
            count++;
            completeFourthOvercomingObstacles = abyss.cat(cat);
        }
        if (completeFourthOvercomingObstacles) {
            count++;
            showInfoParticipants(count, cat.getType(), cat.getName());
        }
    }

    public void goOvercomingObstaclesRobot(Robot robot) {
        int count = 0;
        boolean completeFirstOvercomingObstacles;
        boolean completeSecondOvercomingObstacles = false;
        boolean completeThirdOvercomingObstacles = false;
        boolean completeFourthOvercomingObstacles = false;
        System.out.println();
        completeFirstOvercomingObstacles = wall.robot(robot);
        if (completeFirstOvercomingObstacles) {
            count++;
            completeSecondOvercomingObstacles = treadmill.robot(robot);
        }
        if (completeSecondOvercomingObstacles) {
            count++;
            completeThirdOvercomingObstacles = pool.robot(robot);
        }
        if (completeThirdOvercomingObstacles) {
            count++;
            completeFourthOvercomingObstacles = abyss.robot(robot);
        }
        if (completeFourthOvercomingObstacles) {
            count++;
            showInfoParticipants(count, robot.getType(), robot.getName());
        }
    }

    public void goOvercomingObstaclesBird(Bird bird) {
        int count = 0;
        boolean completeFirstOvercomingObstacles;
        boolean completeSecondOvercomingObstacles = false;
        boolean completeThirdOvercomingObstacles = false;
        boolean completeFourthOvercomingObstacles = false;
        System.out.println();
        completeFirstOvercomingObstacles = abyss.bird(bird);
        if (completeFirstOvercomingObstacles) {
            count++;
            completeSecondOvercomingObstacles = treadmill.bird(bird);
        }
        if (completeSecondOvercomingObstacles) {
            count++;
            completeThirdOvercomingObstacles = pool.bird(bird);
        }
        if (completeThirdOvercomingObstacles) {
            count++;
            completeFourthOvercomingObstacles = wall.bird(bird);
        }
        if (completeFourthOvercomingObstacles) {
            count++;
            showInfoParticipants(count, bird.getType(), bird.getName());
        }
    }

    public void goOvercomingObstaclesFish(Fish fish) {
        int count = 0;
        boolean completeFirstOvercomingObstacles;
        boolean completeSecondOvercomingObstacles = false;
        boolean completeThirdOvercomingObstacles = false;
        boolean completeFourthOvercomingObstacles = false;
        System.out.println();
        completeFirstOvercomingObstacles = pool.fish(fish);
        if (completeFirstOvercomingObstacles) {
            count++;
            completeSecondOvercomingObstacles = treadmill.fish(fish);
        }
        if (completeSecondOvercomingObstacles) {
            count++;
            completeThirdOvercomingObstacles = wall.fish(fish);
        }
        if (completeThirdOvercomingObstacles) {
            count++;
            completeFourthOvercomingObstacles = abyss.fish(fish);
        }
        if (completeFourthOvercomingObstacles) {
            count++;
            showInfoParticipants(count, fish.getType(), fish.getName());
        }
    }

    public void showInfoParticipants(int count, String member, String name) {
        switch (count) {
            case 0:
                System.out.println(member + " " + name + " не прошел ни одного испытания");
                System.out.println();
                break;
            case 1:
                System.out.println(member + " " + name + " прошел " + count +  " испытание");
                System.out.println();
                break;
            case 2:
                System.out.println(member + " " + name + " прошел " + count + " испытания");
                System.out.println();
                break;
            case 3:
                System.out.println(member + " " + name + " прошел" + count + " испытания");
                System.out.println();
                break;
            case 4:
                System.out.println(member + " " + name + " прошел все" + count + " испытания");
                System.out.println();
                break;
        }
    }

    public void showAllPropertiesParticipant(Object[] participants) {
        for(Object participant : participants) {
            nameParticipant(participant);
            if (participant instanceof Jumping) {
                Jumping jumping = (Jumping) participant;
                jumping.jump();
            }
            if (participant instanceof Running) {
                Running running = (Running) participant;
                running.run();
            }
            if (participant instanceof Swimming) {
                Swimming swimming = (Swimming) participant;
                swimming.swim();
            }
            if (participant instanceof Flying) {
                Flying flying = (Flying) participant;
                flying.fly();
            }
        }

    }

    private void nameParticipant(Object participant) {
        System.out.println();
        if (participant instanceof Human) {
            Human human = (Human) participant;
            System.out.println("Игрок '" + human.getType() + " " + human.getName() + "' имеет свойства: ");
        }
        if (participant instanceof Cat) {
            Cat cat = (Cat) participant;
            System.out.println("Игрок '" + cat.getType() + " " + cat.getName() + "' имеет свойства: ");
        }
        if (participant instanceof Robot) {
            Robot robot = (Robot) participant;
            System.out.println("Игрок '" + robot.getType() + " " + robot.getName() + "' имеет свойства: ");
        }
        if (participant instanceof Bird) {
            Bird bird = (Bird) participant;
            System.out.println("Игрок '" + bird.getType() + " " + bird.getName() + "' имеет свойства: ");
        }
        if (participant instanceof Fish) {
            Fish fish = (Fish) participant;
            System.out.println("Игрок '" + fish.getType() + " " + fish.getName() + "' имеет свойства: ");
        }
    }
}
