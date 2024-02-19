package consultation.cons_09.consultationCode.code.example2;

public class Bicycle extends Vehicle{

    private int gear;

    public Bicycle(String manufacture, int gear) {
        super(manufacture);
        this.gear = gear;
    }

    public void changeGear(boolean up){}
}
