package consultation.cons_09.consultationCode.code.example2;

public class Moto extends Vehicle implements SpecialSignal{

    String type;

    public Moto(String manufacture, String type) {
        super(manufacture);
        this.type = type;
    }

    public void accelerate(){}

    @Override
    public void signal() {
        System.out.println("BEEEEP!");
    }
}
