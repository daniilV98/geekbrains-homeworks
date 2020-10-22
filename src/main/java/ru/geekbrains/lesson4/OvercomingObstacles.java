package ru.geekbrains.lesson4;

public class OvercomingObstacles {

    private Wall wall;
    private  Treadmill treadmill;

    public OvercomingObstacles(int wallHeight, int trackLength) {
        wall = new Wall(wallHeight);
        treadmill = new Treadmill(trackLength);
    }

    public void goOvercomingObstaclesHuman(Human human) {
        int count = 0;
        boolean completeSecondOvercomingObstacles = false;
        boolean completeFirstOvercomingObstacles = wall.human(human);
        if (completeFirstOvercomingObstacles) {
            count++;
            completeSecondOvercomingObstacles = treadmill.human(human);
        }
        if (completeSecondOvercomingObstacles)
            count++;
        showInfoParticipants(count, human.getType(), human.getName());
    }

    public void goOvercomingObstaclesCat(Cat cat) {
        int count = 0;
        boolean completeSecondOvercomingObstacles = false;
        boolean completeFirstOvercomingObstacles = wall.cat(cat);
        if (completeFirstOvercomingObstacles) {
            count++;
            completeSecondOvercomingObstacles = treadmill.cat(cat);
        }
        if (completeSecondOvercomingObstacles)
            count++;
        showInfoParticipants(count, cat.getType(), cat.getName());
    }

    public void goOvercomingObstaclesRobot(Robot robot) {
        int count = 0;
        boolean completeSecondOvercomingObstacles = false;
        boolean completeFirstOvercomingObstacles = wall.robot(robot);
        if (completeFirstOvercomingObstacles) {
            count++;
            completeSecondOvercomingObstacles = treadmill.robot(robot);
        }
        if (completeSecondOvercomingObstacles)
            count++;
        showInfoParticipants(count, robot.getType(), robot.getName());
    }

    private void showInfoParticipants(int count, String member, String name) {
        switch (count) {
            case 0:
                System.out.println(member + " " + name + " не прошел ни одного испытания.");
                System.out.println();
                break;
            case 1:
                System.out.println(member + " " + name + " прошел " + count +  " испытание.");
                System.out.println();
                break;
            case 2:
                System.out.println(member + " " + name +" прошел " + count + " испытания.");
                System.out.println();
                break;
        }
    }


}
