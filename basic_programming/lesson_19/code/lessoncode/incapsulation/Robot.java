package lesson_19.code.lessoncode.incapsulation;

public class Robot {

    private String nameRobot;

    private int x;

    private int y;


    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void moveLeft(){
        x = x - 1;
    }

    public void moveRight(){
        x = x + 1;
    }

    public void moveUp(){
        y = y + 1;
    }

    public void moveDown(){
        y = y - 1;
    }

    public void printCoordinate(){
        System.out.println("Я нахожусь: ");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

    }

    public void sayEnergyLevel() {

        int powerLvl = checkPowerLevel();

        System.out.println("Текущий уровень зарядки: " + powerLvl + "%");
    }

    private int checkPowerLevel(){
        // проверяет уровень зарядки батареи

        return 50;
    }

}
