package lesson_38.code;

public class Bicycle {

    private String model;
    private int weight;
    private HandleBar handleBar;
    private Seat seat;

    public Bicycle(String model, int weight, HandleBar handleBar, Seat seat) {
        this.model = model;
        this.weight = weight;
        this.handleBar = handleBar;
        this.seat = seat;
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

    public HandleBar getHandleBar() {
        return handleBar;
    }

    public Seat getSeat() {
        return seat;
    }
}
