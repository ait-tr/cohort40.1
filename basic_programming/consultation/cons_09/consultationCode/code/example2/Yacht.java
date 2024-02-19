package consultation.cons_09.consultationCode.code.example2;

public class Yacht extends Vehicle implements SpecialSignal{
    Integer lengthFeet;

    public Yacht(String manufacture, Integer lengthFeet) {
        super(manufacture);
        this.lengthFeet = lengthFeet;
    }

    public void sailUp(){}


    @Override
    public void signal() {
        System.out.println("Radio signal!");
    }
}
