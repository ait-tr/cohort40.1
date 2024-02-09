package lesson_19.code.lessoncode.incapsulation;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0);

        robot.moveLeft();
        robot.moveLeft();
        robot.moveLeft();
        robot.moveUp();
        robot.moveUp();
        robot.printCoordinate();

        // robot.x = 0;

        robot.printCoordinate();

        robot.sayEnergyLevel();

    }
}
