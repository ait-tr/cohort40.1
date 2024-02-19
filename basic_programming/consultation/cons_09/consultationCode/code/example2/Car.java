package consultation.cons_09.consultationCode.code.example2;

public class Car extends Vehicle implements SpecialSignal{

    String model;

    public Car(String manufacture, String model) {
        super(manufacture);
        this.model = model;
    }

    public void start(){}


    @Override
    public void signal() {
        System.out.println("SIRENA!!!");
    }
}
