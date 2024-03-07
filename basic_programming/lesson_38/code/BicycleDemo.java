package lesson_38.code;

public class BicycleDemo {
    public static void main(String[] args) {
        HandleBar handleBar = new HandleBar();
        Seat seat = new Seat();

        Bicycle bicycle = new Bicycle("model1", 4, handleBar, seat);

        bicycle.getHandleBar().right();

        // равносильно
        //handleBar.right();

        BicycleInnerClasses myBicycle = new BicycleInnerClasses("super", 3);
        BicycleInnerClasses.HandleBar handleBarInner = myBicycle.new HandleBar(true);
        BicycleInnerClasses.Seat seatInner = myBicycle.new Seat();

        handleBarInner.right();
        seatInner.up();

        seatInner.getSeatParam();


    }
}
