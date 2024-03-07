package lesson_38.code.innerClasses;

public class BicycleInnerClasses {

    private String model;
    private int weight;

    private int seatDiameter;


    public BicycleInnerClasses(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public class HandleBar {
        private boolean isClean;

        public HandleBar(boolean isClean) {
            this.isClean = isClean;
        }

        public void right(){
            System.out.println("Turn right");
        }
        public void left(){
            System.out.println("Turn left");
        }
    }

    public class Seat {
        public void up(){
            System.out.println("Сиденье отрегулировано вверх");
        }

        public void down(){
            System.out.println("Сиденье отрегулировано вниз");
        }

        public void getSeatParam(){
            System.out.println("Параметры сиденья: " + seatDiameter);
        }
    }


}
